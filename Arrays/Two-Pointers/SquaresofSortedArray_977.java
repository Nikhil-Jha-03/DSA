public class SquaresofSortedArray_977 {

    static int genSquare(int num){
        return  num*num;
    }

    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10,34,65,100};

        int i = 0;
        int j = nums.length-1;
        int[] arr = new int[nums.length];
        int index = nums.length-1;

        while (i <= j) {
            if (genSquare(nums[i]) > genSquare(nums[j]) ) {
                arr[index] = genSquare(nums[i]);
                index--;
                i++;
            } else {
                arr[index] = genSquare(nums[j]);
                index--;
                j--;
            }
        }

        for (int k : arr) {
         System.out.print(k + " ");   
        }
    }
}
