import java.util.ArrayList;
import java.util.List;

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

    static void insertionSort(int[] arr) {

        // Self
        // unoptimized best case is still O(n)
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                System.out.println("RUNS");
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    // System.out.println("RUNS");
                }
            }
        }

        // Striver's
        // More Optimized Best Case O(n)
        // for (int i = 1; i < arr.length - 1; i++) {
        // int j = i;
        // while (j > 0 && arr[j - 1] > arr[j]) {
        // int temp = arr[j - 1];
        // arr[j - 1] = arr[j];
        // arr[j] = temp;
        // j--;
        // }

        // }

        for (int ar : arr) {
            System.out.print(ar + " ");
        }
    }

    static void mergeArray(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();

        // for first Array -> left Side Array Merging
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    static void mergeSort(int[] arr, int low, int high) {

        if (low == high) {
            return;
        }

        int mid = (low + high) / 2;
        // Left Divided Array
        mergeSort(arr, low, mid);
        // Right Divided Array
        mergeSort(arr, mid + 1, high);
        // For Sorting
        mergeArray(arr, low, mid, high);
    }

    static void recursiveBubbleSort(int arr[], int n, int left) {
        System.out.println("N: " + n);
        if (n == 1) {
            return;
        }

        if (left == n) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }

        recursiveBubbleSort(arr, n - 1, left);

    }

    static void recursiveInsertionSort(int[] arr, int n, int start) {
        if (start > n) {
            return;
        }
        int j = start;

        while (j > 0 && arr[j] < arr[j - 1]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursiveInsertionSort(arr, n, start + 1);
    }

    static int findPartition(int[] arr, int left, int right) {
        // { 4,6,2,5,7,9,1,3};

        int pivot = arr[left];
        int i = left;
        int j = right;

        while (i < j) {

            while (arr[i] <= pivot && i <= right - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= left + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }

        }

        int temp = arr[left];
        arr[left] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = findPartition(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }

    }

    public static void main(String[] args) {
        
        // int arr[] = { 13, 46, 24, 52, 20, 9 };
        // int arr[] = { 9, 14, 15, 12, 6, 8, 13 };
        // int arr[] = { 1,2,3,4,5,6,7,8,9,10 };
        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        // int arr[] = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        // mergeSort(arr, 0, arr.length - 1);
        // for(int a : arr){
        // System.out.print( a + " ");
        // }

        // recursiveBubbleSort(arr, arr.length - 1, 1);
        // for (int a : arr) {
        // System.out.print(a + " ");
        // }

        // recursiveInsertionSort(arr, arr.length - 1, 1);
        // for (int a : arr) {
        // System.out.print(a + " ");
        // }

        int arr[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
        quickSort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }

    }
}