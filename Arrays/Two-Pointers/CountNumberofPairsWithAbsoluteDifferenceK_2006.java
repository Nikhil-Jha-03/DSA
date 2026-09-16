import java.util.HashMap;
import java.util.Map;

public class CountNumberofPairsWithAbsoluteDifferenceK_2006 {
    public static void main(String[] args) {
        int nums[] = { 1, 1 };
        int k = 0;

        // int counter = 0;
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums.length; j++) {
        // if (nums[i] - nums[j] == k) {
        // counter++;
        // }
        // }
        // }
        // System.out.print(counter);

        // Approach 2;

        // int counter = 0;
        // int i= 0;
        // int j = nums.length-1;

        // while (i < nums.length) {
        // if (j<0) {
        // i++;
        // j = nums.length-1;
        // } else if (nums[i] - nums[j] == k) {
        // counter++;
        // j--;
        // }else {
        // j--;
        // }
        // }

        // System.out.print(counter);

        // Approach 3
        // Map<Integer, Integer> mp = new HashMap<>();
        // int counter = 0;

        // for (int i = 0; i < nums.length; i++) {
        // if (mp.containsKey(nums[i] - k)) {
        // counter += mp.get(nums[i] - k);
        // }

        // if (mp.containsKey(nums[i] + k)) {
        // counter += mp.get(nums[i] + k);
        // }

        // mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);

        // }

        // System.out.print(counter);




        // Leetcode other user code
        // class Solution {
        //     public int countKDifference(int[] nums, int k) {
        //         int diff = 0;
        //         int count = 0;
        //         for (int i = 0; i < nums.length; i++) {
        //             for (int j = i + 1; j < nums.length; j++) {
        //                 diff = Math.abs(nums[i] - nums[j]);
        //                 if (diff == k) {
        //                     count++;
        //                 }
        //             }
        //         }
        //         return count;
        //     }
        // }

    }
}
