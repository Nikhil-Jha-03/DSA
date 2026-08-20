import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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
                System.out.println("unsorted");
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
            if (arr[i] > arr[(i + 1) % arr.length]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }

        return true;

    }

    // We will use pointer pattern
    static boolean removeDuplicateFromArray() {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        // set operation (here insert) use log n time complexity
        // for this brute force time complexity is O(n log n + n) space = O(n)
        // Set<Integer> st = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        // st.add(arr[i]);
        // }

        // int index = 0;

        // for (int s : st) {
        // arr[index] = s;
        // index++;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");

        // Optimal Approach
        // Time Complexity O(n)
        // int ptr1 = 0;
        // int ptr2 = 1;

        // while (ptr2 < arr.length) {

        // if (arr[ptr2] != arr[ptr1]) {
        // arr[ptr1 + 1] = arr[ptr2];
        // ptr1++;
        // }

        // ptr2++;
        // }

        // System.out.println("Index : " + (ptr1 + 1));

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]);

        // }

        // or using just one ptr
        int a = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[a] != arr[i]) {
                a++;
                arr[a] = arr[i];
            }
        }
        System.out.println("Index : " + (a + 1));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }

        return false;
    }

    static void rotateArray() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3 % nums.length;

        // Brute Force Apprach time = O(n^2) space =O(n)
        // List<Integer> arr = new ArrayList<>();
        // for (int i = k+1; i < nums.length; i++) {
        // arr.add(nums[i]);
        // }
        // for (int i = 0; i <= k; i++) {
        // arr.add(nums[i]);
        // }
        // for(int a : arr){
        // System.out.print(a+" ");
        // }

        // better Apprach
        // O(n)
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, d - 1);
        reverse(nums, d, nums.length - 1);
        for (int a : nums) {
            System.out.print(a + " ");
        }

    }

    static void leftRotateByOne() {
        // time complixity O(n) space use to solve is O(n) (as changes is done in the
        // same array) extra space O(1)
        int[] nums = { 1, 2, 3, 4, 5 };

        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // swap

            nums[i - 1] = nums[i];

        }
        nums[nums.length - 1] = temp;

        for (int i = 0; i < nums.length; i++) {
            // 3

            System.out.print(nums[i]);

        }

    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    static void leftRotateByD() {
        // time complixity O(n) space use to solve is O(n) (as changes is done in the
        // same array) extra space O(1)
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 3 % nums.length;

        // for (int i = 0; i < d; i++) {
        // int temp = nums[0];
        // for (int j = 1; j < nums.length; j++) {
        // nums[j-1] = nums[j];
        // }
        // nums[nums.length-1] = temp;
        // }
        // for (int i = 0; i < nums.length; i++) {
        // System.out.print(nums[i]);
        // }

        reverse(nums, 0, d - 1);

        reverse(nums, d, nums.length - 1);

        reverse(nums, 0, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }

    }

    static void rotateZeros() {
        int[] nums = { 0, 1, 0, 3, 12 };

        // Brute Force
        // Time O(n)
        // Space O(n)

        // List<Integer> arr = new ArrayList<>();
        // int zeroCounter = 0;
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == 0) {
        // zeroCounter++;
        // } else {
        // arr.add(nums[i]);
        // }
        // }
        // while (zeroCounter-- > 0) {
        // arr.add(0);
        // }
        // for(int a : arr){
        // System.out.print(a);
        // }

        // Optimal
        // TwoPointer
        // int left = 0;
        // int right = 0;
        // while (left < nums.length-2) {
        // if (nums[left] == 0) {
        // if (nums[right] != 0) {
        // int temp = nums[right];
        // nums[right] = nums[left];
        // nums[left] = temp;
        // left++;
        // } else {
        // if (right < nums.length) {
        // right++;
        // }
        // }
        // } else {
        // left++;
        // right++;
        // }
        // }

        // for (int a : nums) {
        // System.out.print(a);
        // }

        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1)
            return;

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        for (int a : nums) {
            System.out.print(a);
        }

    }

    static int[] ApplyOperationstoArray() {
        // int[] nums = { 0, 1, 0, 3, 12 };
        int[] nums = { 1, 2, 2, 1, 1, 0 };

         for(int i = 0; i< nums.length-1 ; i++ ){
            if(nums[i] == nums[i+1]){
                int temp = nums[i+1];
                nums[i+1] = 0;
                nums[i] = temp * 2;
            }
        }

        int ptr = 0;

        while(ptr < nums.length){
            if(nums[ptr] == 0){
                break;
            }
                ptr++;
        }
        
        for(int j = ptr+1; j< nums.length ; j++ ){
            if(nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[ptr];
                nums[ptr] = temp;
        ptr++;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        // largestElementInAnArray();
        // secondLargestElementInAnArray();
        // secondSmallestElementInAnArray();
        // checkIfAnArrayIsSorted();
        // removeDuplicateFromArray();
        // rotateArray();
        // leftRotateByOne();
        // leftRotateByD();
        // rotateZeros();
       int[] result = ApplyOperationstoArray();

       for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]+ " ");
        
       }
    }
}