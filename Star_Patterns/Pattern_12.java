public class Pattern_12 {
    public static void main(String[] args) {
        int num = 5;

        // int totalCol = num * 2; // or
        int spacesRefence = 2 * (num - 1);

        // int spaces = 0;

        for (int i = 0; i < num; i++) {

            // number to Print
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            // spaces;
            // spaces = totalCol - ((i + 1) * 2);
            // for (int j = 0; j < spaces; j++) {
            // System.out.print(" ");
            // }

            // Reference
            for (int j = 1; j <= spacesRefence; j++) {
                System.out.print(" ");
            }

            for (int l = i + 1; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
            spacesRefence -= 2;
        }
    }
}
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321