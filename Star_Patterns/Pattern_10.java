public class Pattern_10 {
    public static void main(String[] args) {
        int num = 5;
        int totalRow = (2 * num) - 1;
        int mid = (totalRow) / 2;
        int stars = 0;

        for (int i = 0; i < totalRow; i++) {
            if (i < mid) {
                stars = i + 1;
            } else {

                stars = totalRow - i;
                // or
                // stars = 2 * num - (i+1);

            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *