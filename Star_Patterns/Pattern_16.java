public class Pattern_16 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num; i++) {

            // A = 65 , 65+1 = B // ascii value
            char ch =  (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
// A
// BB
// CCC
// DDDD
// EEEEE