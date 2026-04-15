public class Pattern_8 {
     public static void main(String[] args) {
        int num = 5;

        int stars = 0;
        int spaces = 0;

        for (int i = 1; i <= num; i++) {
            spaces = num - i;
            stars = i;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
