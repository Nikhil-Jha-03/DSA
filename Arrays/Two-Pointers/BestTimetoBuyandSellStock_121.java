import java.util.Arrays;

public class BestTimetoBuyandSellStock_121 {
    public static void main(String[] args) {


        int prices[] = {7,1,5,3,6,4};

        int profit = 0;
        int minSoFar = prices[0];



        // for (int i = 1; i < prices.length; i++) {

        //     int gain = prices[i] - minSoFar;

        //     if (gain > profit) {
        //         profit = gain;
        //     }

        //     if (prices[i] < minSoFar) {
        //         minSoFar = Math.min(minSoFar, prices[i]);
        //     }
        // }
        
        // for (int i = 1; i < prices.length; i++) {
        //     int gain = prices[i] - minSoFar;

        //     if (gain > profit) {
        //         profit = gain;
        //     }

        //     if (prices[i] < minSoFar) {
        //         minSoFar = prices[i];
        //     }
        // }   
        // System.out.println(profit);

        int i = 0;
        int j = 0;


        while (j < prices.length) {
            if (prices[i] > prices[j]) {
                i = j;
            }

            if (prices[j] - prices[i] > profit) {
                profit = prices[j] - prices[i];
            }

            j++;
        }

        System.out.println(profit);


    }

}
