import java.util.*;

public class Main {

    static void hashing1() {
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
                hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            }
        }

        System.out.println("HM: " + hm);

        sc.close();
    }

    static void characterHashing2() {
        String str = "abcdefhfdgh";
        Map<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < str.length(); i++) {
        // if (map.containsKey(str.charAt(i))) {
        // map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
        // } else {
        // map.put(str.charAt(i), 1);
        // }
        // }

        for (int i = 0; i < str.length(); i++) {
            Integer helo = map.get(str.charAt(i));

            if (helo == null) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(null, map.getOrDefault(str.charAt(i), 0) + 1);
            }
        }

        System.out.println(map);
    }

    static void hashing3() {
        int arr[] = { 2, 2, 3, 4, 4, 2 };
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {

                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            System.out.println(mp.getKey() + " -> " + mp.getValue());
        }

        // System.out.println(map);

    }

    static void highestlowestFrequencyElement() {
        int arr[] = { 10, 5, 10, 15, 10, 5 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {

                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxElement = 0, maxFrequency = 0;
        int minElement = 0, minFrequency = arr.length;

        for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
            int element = mp.getKey();
            int count = mp.getValue();

            if (count < minFrequency) {
                minFrequency = count;
                minElement = element;
            }

            if (count > maxFrequency) {
                maxFrequency = count;
                maxElement = element;
            }
        }

        System.out.println(maxElement + " " + minElement);

    }

    public static void main(String[] args) {
        // hashing1();
        // hashing3();
        highestlowestFrequencyElement();
    }

}
