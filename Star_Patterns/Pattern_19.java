public class Pattern_19 {
    public static void main(String[] args) {

        int num = 5;
        int space = 0;
        int star = 0;
        int totalRow = 2 * num;
        int mid = totalRow / 2;
        
        // [start , space , star]

        // Top Part
        // for (int i = 0; i < num; i++) {

        // // star
        // for (int j = 0; j <= (num - i - 1); j++) {
        // System.out.print("*");
        // }

        // // space

        // space = (i * 2);

        // for (int j = 0; j < space; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j <= (num - i - 1); j++) {
        // System.out.print("*");
        // }

        // System.out.println();

        // }

        // Bottom Part
        // for (int i = 0; i < num; i++) {
        // // star
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }

        // // space

        // space = (num - i - 1) * 2;
        // for (int j = 0; j < space; j++) {
        // System.out.print(" ");
        // }

        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();

        // }
        for (int i = 0; i < totalRow; i++) {

            if (i < mid) {
                star = (num - i - 1);
                space = (2 * i);

            } else {
                star = i - mid;
                space = 2 * (totalRow - i - 1);
            }

            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********