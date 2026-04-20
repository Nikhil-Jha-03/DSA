public class Main {

    static void extractNumber() {
        int num = 7789;

        while (num > 0) {
            int digit = num % 10; // get last digit
            System.out.println(digit);

            num = num / 10; // remove last digit
        }

    }

    static void countAllDigitsOfANumber() {
        int num = 3456;

        // int count = 0;
        // while (num > 0) {
        // int digit = num % 10;
        // count += 1;
        // num = num / 10;
        // }

        // System.out.println(count);

        // or can use 1ogbase10
        int result = (int) (Math.log10(num) + 1);
        System.out.println(result);

        // time complexity = O(log10(n))

        // remember if division is done by 10 then log10 if 2 the log2 and so on
        // if we use divion in loop then the time complexity will become log
    }

    static void reverseNumber() {
        int num = 1234;
        int reverseNumber = 0;
        while (num > 0) {
            // System.out.println(num);
            int  digit = num%10;
            // System.out.println(digit);
            
            reverseNumber = (reverseNumber * 10 ) + digit;


            num = num/10;
        }

        System.out.println(reverseNumber);

    }

    public static void main(String[] args) {
        // extractNumber(); extract and remove number
        // countAllDigitsOfANumber(); count the lenght of the number
        reverseNumber();
    }
}
