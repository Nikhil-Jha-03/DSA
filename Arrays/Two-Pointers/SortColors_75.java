public class SortColors_75 {
    public static void main(String[] args) {

        // The Dutch National Flag (DNF) algorithm—originally proposed by computer scientist Edsger Dijkstra—is an efficient linear-time sorting algorithm designed to sort an array containing three distinct values (commonly represented as 0s, 1s, and 2s, or Red, White, and Blue)


        int nums[] = { 2, 0, 2, 1, 1, 0 };

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid<=high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;     
            }
        }

        for (int k : nums) {
            System.out.print(k + " ");
        }

    }
}
