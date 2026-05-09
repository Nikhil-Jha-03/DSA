import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            Integer helo = hm.get(arr[i]);

            if (helo == null) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
            }

        }

        System.out.println("HM: " + hm);

        // HashMap<Integer , Integer> hm = new HashMap<>();
        // List<Integer> data = new ArrayList<{2,3,4,5,2,4,6}>;

        sc.close();
    }
}
