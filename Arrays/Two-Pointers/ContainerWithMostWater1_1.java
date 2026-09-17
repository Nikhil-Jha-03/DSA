public class ContainerWithMostWater1_1 {

    public static void main(String[] args) {

        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        int maxHeight = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int MinWaterStore= Math.min(height[i], height[j]);
            int width = j-i;
            int area = MinWaterStore * width;
            maxHeight = Math.max(maxHeight, area);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        System.out.println(maxHeight);

    }
}
