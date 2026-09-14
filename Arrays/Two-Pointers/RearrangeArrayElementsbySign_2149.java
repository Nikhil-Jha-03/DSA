public class RearrangeArrayElementsbySign_2149 {

    // Approach One
    // public static void main(String[] args) {
    // int nums[] = { 3, 1, -2, -5, 2, -4 };
    // List<Integer> pos = new ArrayList<>();
    // List<Integer> neg = new ArrayList<>();
    // for (int i : nums) {
    // if (i >= 0) {
    // pos.add(i);
    // } else {
    // neg.add(i);
    // }
    // }
    // int i = 0;
    // int j = 0;
    // int index = 0;
    // while (i < pos.size() && j < neg.size()) {
    // nums[index] = pos.get(i);
    // index++;
    // i++;
    // nums[index] = neg.get(j);
    // index++;
    // j++;
    // }
    // for (int integer : nums) {
    // System.out.print(integer + " ");
    // }
    // }

    // Approach2
    public static void main(String[] args) {
        int nums[] = { 3,1,-2,-5,2,-4 };

        int[] result = new int[nums.length];
        int i = 0;
        int j = 1;
        
        for (int k = 0; k < result.length; k++) {
            if (nums[k] >= 0) {
                result[i] = nums[k];
                i += 2;
            } else {
                result[j] = nums[k];
                j += 2;
            }
        }
        for (int l : result) {
            System.out.print(l + " ");
        }
    }

    // the appoarch 1 and 2 uses extra space because we want to maintain the order
    // but if the order do not matter then there is no need to use extra space

    // Approach 3 : when order does not matter
    // public static void main(String[] args) {
    // int nums[] = { 3,1,-2,-5,2,-4 };
    // int i = 0;
    // int j = 1;
    // while (i < nums.length && j < nums.length) {
    // if (nums[i] >= 0 ) {
    // i+=2;
    // } else if (nums[j] < 0) {
    // j+=2;
    // } else {
    // int temp = nums[i];
    // nums[i] = nums[j];
    // nums[j] = temp;
    // }
    // }
    // for (int k : nums) {
    // System.out.print(k + " ");
    // }
    // }

}
