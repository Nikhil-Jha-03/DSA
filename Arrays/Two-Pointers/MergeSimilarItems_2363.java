import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MergeSimilarItems_2363 {
    public static void main(String[] args) {

        // Time Complexity O(n + m)
        // Space Complexity O(n + m) worst case
        // Loop through HashMap
        // for (Map.Entry<Integer,Integer> elem : mp.entrySet())
        // Runs k times:
        // O(k)
        // Total Time Complexity
        // O(n + m + k)
        // Since k ≤ n + m, we usually simplify it to:
        // Time Complexity: O(n + m)

        int items1[][] = { { 1, 1 }, { 4, 5 }, { 3, 8 } };
        int items2[][] = { { 3, 1 }, { 1, 5 } };

        List<List<Integer>> temp = new ArrayList<>();
        Map<Integer, Integer> mp = new TreeMap<>();

        for (int i = 0; i < items1.length; i++) {
            System.out.println(items1[i][0] + " - - " + items1[i][1]);
            mp.put(items1[i][0], items1[i][1]);
        }

        for (int i = 0; i < items2.length; i++) {
            mp.put(items2[i][0],mp.getOrDefault(items2[i][0], 0) + items2[i][1]);
        }

        int index = 0;

        for (Map.Entry<Integer, Integer> elem : mp.entrySet()) {
            temp.add(List.of(elem.getKey(), elem.getValue()));
            index++;
        }

        System.out.println(temp);

    }
}