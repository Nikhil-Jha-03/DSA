public class Pattern_15 {
    public static void main(String[] args) {
        int num = 5;

        // for (int i = num; i > 0; i--) {

        //     for (char ch = 'A'; ch <= 'A' + (i-1); ch++) {
        //         System.out.print(ch);
        //     }
            
        //     System.out.println();
        // }

        for (int i = 0; i < num; i++) {

            // ch <= 'A' + (num - i - 1) because A(1)----(4) 
            for (char ch = 'A'; ch <= 'A' + (num - i - 1); ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
// ABCDE
// ABCD
// ABC
// AB
// A