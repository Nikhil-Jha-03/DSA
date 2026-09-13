public class SortArrayByParityII_922 {

    public static void main(String[] args) {
        int[] nums = {3,1,4,2};

        int i = 0, j = 1, n = nums.length;
        while (i < n && j < n) {
            if(nums[i] % 2 == 0) i+=2;
            else if (nums[j] % 2 == 1) j+=2;
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i += 2;
                j += 2;
            }
        }

        for (int in : nums) {
            System.out.print(in + " ");
        }

    }

}
