public class RemoveElement_27 {
    public static void main(String[] args) {

        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;

        // wrong approach
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {

            if (nums[i] != val) {
                i++;
            } else if (nums[j] == val) {
                j--;
            } else {
                nums[i] = nums[j];
                j--;
                i++;
            }
        }
        // return i+1; for leetcode

        // int index = 0;

        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != val) {
        // nums[index] = nums[i];
        // index++;
        // }
        // }

        for (int k : nums) {
            System.out.print(k + " ");
        }

        System.out.println();
        System.out.println(j + 1);

    }
}
