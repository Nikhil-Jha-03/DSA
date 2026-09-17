import java.util.*;

public class TwoSumIIInputArrayIsSorted_167 {

    static void hey() {

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4 };
        int target = 6;

        // Map<Integer,Integer> mp = new HashMap<>();

        // for (int i = 0; i < numbers.length; i++) {
        // int data = target - numbers[i];

        // if (mp.containsKey(data)) {
        // System.out.println(mp.get(data)+1+ " " +i+1);
        // // return new int[]{mp.get(data)+1, i+1};
        // } else {
        // mp.put(numbers[i], i);
        // }
        // }

        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();

        // for (int integer : numbers) {
        // list.add(integer);
        // }

        // int i = 0;
        // int j = numbers.length - 1;

        // while (i < j) {
        // if (list.get(i) + list.get(j) == target) {
        // list2.add(i+1);
        // list2.add(j+1);
        // break;
        // } else if (list.get(i) + list.get(j) > target) {
        // j--;
        // } else {
        // i++;
        // }
        // }
        // System.out.print(list2);

        int i = 0;
        int j = numbers.length - 1;
        int mid = (i + j) / 2;

        if (numbers[mid] > target) {
            j = mid;
        }
        
        while (i < j) {

            if (numbers[i] + numbers[j] == target) {

            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }

    }
}
