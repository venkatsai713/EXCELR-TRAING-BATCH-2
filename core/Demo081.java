public class Demo081 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        System.out.println("Leader elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}