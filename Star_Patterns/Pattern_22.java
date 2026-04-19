public class Pattern_22 {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 0; i < 2 * num - 1 ; i++) {
            for (int j = 0; j < 2*num-1; j++) {
                
                int top = i;
                int left = j;
                int right = (2 * num - 2) - j;
                int bottom = (2 * num - 2) - i;
  
                System.out.print(num- Math.min(Math.min(top,bottom),Math.min(left,right)));
            }
            System.out.println();
        }

    }
}
