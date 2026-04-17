public class Pattern_17 {
    public static void main(String[] args) {
        int num = 5;

        int spaces = 0;

        for (int i = 0; i < num; i++) {

            spaces = num - i - 1;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                // System.out.println((j/2)+1);
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
