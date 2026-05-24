public class Main {

    // Maximum lenght of array we can store is 10^6 for locally defined array and
    // for globally defined array is 10^7
    static void largestElementInAnArray() {
        int arr[] = { 2, 5, 1, 3, 0 };

        // brute force Approach use sorthing technique like merge or quick sort
        // quick sort O(n log n)

        // Optimal Approach O(n)
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static void secondLargestElementInAnArray() {

        // Brute force = sort like merge or quick O(n log n)
        // we should not keep the second largest number same as largest number
        // when we find the largest number we can reverse loop from n-2 to 0 and check
        // if it is less then largest and also not == largest or simply check if arr[i]
        // is > then secondLargest and != largest

        // Better Approach = O(2n)
        int arr[] = { 1, 2, 4, 7, 7, 5, 7, 7, 7, 8, 8, 8, 2, 3, 4, 5, 7, 8, 9, 13, 14 };

        // int secondLargest = 0;
        // int Largest = 0;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > Largest) {
        // Largest = arr[i];
        // }
        // }

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > secondLargest && arr[i] != Largest) {
        // secondLargest = arr[i];
        // }
        // }

        // Optimal Approach
        int secondLargest = -1;
        int Largest = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > Largest) {
                secondLargest = Largest;
                Largest = arr[i];
            } else if (arr[i] < Largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }

        System.out.println(secondLargest);

    }

    static void secondSmallestElementInAnArray() {
        int arr[] = { 1, 2, 4, 7, 7, 5, 7, 7, 7, 8, 8, 8, 3, 4, 5, 7, 8, 9, 13, 14 };
        // brute = sorting O(n log n) -> select arr[1]; as the second smallest -- also
        // check size of the array ie it has to have atleast two element

        // better apporach O(2n)

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] < smallest) {
        // smallest = arr[i];
        // }
        // }

        // smallest = 1;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > smallest && arr[i] < secondSmallest) {
        // secondSmallest = arr[i];
        // }
        // }

        // optimal approach
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);

    }

    static boolean checkIfAnArrayIsSorted() {
        int[] arr = { 1, 2, 3, 4, 5, 2 };

        // brute force approach;
        // O(n^2)
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] < arr[i]) {
        // return false;
        // }
        // }
        // }

        // Optimal approach;
        // O(n)
        for (int i = 0; i < arr.length - 1; i++) { // no index out of bound error so lenght -1
            // if (arr[i - 1] < arr[i] && arr[i] < arr[i + 1]) {
            // return true;
            // }

            if (arr[i] > arr[i + 1]) {
                System.out.println("unsorter");
                return false;
            }
        }
        System.out.println("Sorted");
        return true;
    }

    static boolean checkIfArrayIsSortedAndRotated() {
        int[] arr = { 3, 4, 5, 1, 2 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >  arr[(i+1)%arr.length]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }

        return true;



    }

    public static void main(String[] args) {
        // largestElementInAnArray();
        // secondLargestElementInAnArray();
        // secondSmallestElementInAnArray();
        checkIfAnArrayIsSorted();
    }
}
