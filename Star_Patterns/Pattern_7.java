public class Pattern_7 {
    public static void main(String[] args) {
        int num = 5;

        int stars = 0;
        int spaces = 0;


        for (int i = 1; i <= num; i++) {
            spaces = num - i;
            stars = 2 * i - 1;

            // stars = 2 * i + 1;  + if we take i = 0 i < num

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            // can also do like
            // for (int k = 0; k < 2 * i - 1; k++) {
            //     System.out.print("*");
            // }

             for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }




            System.out.println();
        }

    }
}
//     *    
//    ***
//   *****
//  *******
// *********


// for (int i = num; i >= 1; i--) {
// for 
// *********
//  *******
//   *****
//    ***
//     *