public class SortArrayByParity_905 {

    // public static boolean isEven(int number) {
    //     return (number & 1) == 0;
    // 2 = 10
    // 3 = 11
    // 0 -> even 
    // 1 -> odd
    // }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4 };

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int i : arr) {
            System.out.print(i + "");
        }

    }
}
