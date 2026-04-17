public class Pattern_18 {
    public static void main(String[] args) {
        int num = 5;

        // Method 1
        for (int i = 0; i < num; i++) {

            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        // Method 2
        for (int i = 0; i < num; i++) {

            char ch = (char) ('A' + (num - i - 1));

            for (int k = 0; k <= i; k++) {
                System.out.print(ch+" ");
                ch++;
            }

            System.out.println();
        }

    }
}
// E
// D E
// C D E
// B C D E
// A B C D E
