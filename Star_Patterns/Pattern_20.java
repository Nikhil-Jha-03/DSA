public class Pattern_20 {
    public static void main(String[] args) {
        int num = 5;
        int totalRow = 2 * num - 1;
        int mid = totalRow / 2;
        int star = 0;
        int space = 0;

        for (int i = 0; i < totalRow; i++) {
            if (i < mid) {
                star = i + 1;
                space = 2 * (num - i - 1);
            }
             else {
                star = totalRow - i;
                space = 2 * (i - num + 1);
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

//     Without if else
//     for (int i = 0; i < totalRow; i++) {
//     int distance = Math.abs(mid - i);
//     star = num - distance;
//     space = 2 * distance;
//     for (int j = 0; j < star; j++) {
//         System.out.print("*");
//     }
//     for (int j = 0; j < space; j++) {
//         System.out.print(" ");
//     }
//     for (int j = 0; j < star; j++) {
//         System.out.print("*");
//     }
//     System.out.println();
// }


}
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *