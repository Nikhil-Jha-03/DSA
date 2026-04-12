package Star_Patterns;

public class Pattern_3 {
      public static void main(String[] args) {
        int num = 4;
        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    } 
}
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 