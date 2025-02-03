public class LTCode009 {
    public static void main(String[] args) {
        int[] num1 = {1, 3};
        int[] num2 = {2};

        double median = findMedianSortedArrays(num1, num2);
        System.out.println("Median: " + median);
    }

    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        if (num1.length > num2.length) {
            return findMedianSortedArrays(num2, num1);
        }

        int m = num1.length, n = num2.length;
        int low = 0, high = m;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : num2[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : num1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : num2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : num2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted properly.");
    }
}
