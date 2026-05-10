public class Main {

    static void selectionSort(int[] arr) {

        int minIndex = 0;
        // i<arr.length-2 because no need to chech the last iteration
        for (int i = 0; i < arr.length - 2; i++) {
            minIndex = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap i with the min
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }

    static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--) {
            int count = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    count = 1;
                }
            }
            if (count == 0) {
                break;
            }
        }

        for (int arrs : arr) {
            System.out.print(arrs + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        // selectionSort(arr);
        bubbleSort(arr);
    }

}
