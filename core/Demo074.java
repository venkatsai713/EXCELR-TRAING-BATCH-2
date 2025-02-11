class SortArray {
    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
public class Demo074 {
     public static void main(String[] args) {
        int[] arr = {40, 37, 43, 46, 34, 38};
        SortArray obj = new SortArray();
        obj.sort(arr);
    }
}
