import java.util.HashMap;
import java.util.Map;
import java.util.stream.Gatherer.Integrator;

public class TwoSum_1 {

    public static void main(String[] args) {

        // Brute Force
        // Time Complexity == O(n^2)
        // int nums[] = { 3,4,2 };
        // int target = 6;

        // for (int i = 0; i < nums.length-1; i++) {
        // for (int j = i+1; j < nums.length; j++) {
        // if (nums[i] + nums[j] == target) {
        // System.out.print(i + " " + j);
        // return;
        // }
        // }
        // }


        // Better Apprach
        // create a HashMap -> Build HM -> find sum
        // TC = O(n) SC = O(n)
        int nums[] = { 2,7,11,15};
        int target = 9;

        Map<Integer, Integer> mp = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     mp.put(nums[i], i);
        // }

        // for (Map.Entry<Integer, Integer> elem : mp.entrySet()) {
        //     System.out.println(elem.getKey() + " : " + elem.getValue());
        // }

        // for (int i = 0; i < nums.length; i++) {

        //     int data = target - nums[i];
        //     if (mp.containsKey(data) && mp.get(data) != i) {
        //         System.out.println(i + " " + mp.get(data));
        //     }
        // }


        // Optimal Approach

        for (int i = 0; i < nums.length; i++) {
            int data = target - nums[i];

            if (mp.containsKey(data) && mp.get(data) != i) {
                System.out.println(mp.get(data)+ " " + i);
            }

            mp.put(nums[i], i);
            
        }

        System.out.print(mp);

    }
}
