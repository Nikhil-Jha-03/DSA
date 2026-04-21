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

        // 7. Reverse Integer

        // Given a signed 32-bit integer x, return x with its digits reversed. If
        // reversing x causes the value to go outside the signed 32-bit integer range
        // [-231, 231 - 1], then return 0.

        // Assume the environment does not allow you to store 64-bit integers (signed or
        // unsigned).

        // Example 1:

        // Input: x = 123
        // Output: 321
        // Example 2:

        // Input: x = -123
        // Output: -321
        // Example 3:

        // Input: x = 120
        // Output: 21

        // Constraints:

        // -231 <= x <= 231 - 1

        int num = -1234;
        int reverseNumber = 0;

        while (num != 0) {
            // System.out.println(num);

            int digit = num % 10;

            if (reverseNumber > (Integer.MAX_VALUE) / 10 ||
                    reverseNumber < (Integer.MIN_VALUE) / 10) {

                System.out.println("Out Of Bound");
                return; // STOP here
            }

            reverseNumber = (reverseNumber * 10) + digit;

            num = num / 10;
        }

        // return (num < absNum) ? reverseNumber : (-reverseNumber);
        System.out.println(reverseNumber);

    }

    static void checkNumberPalindrome() {
        int x = 121;
        int original = x;
        int reversed = 0;

        if (x < 0) {
            System.out.println("False");
            // return false;
            return;
        }

        while (x != 0) {
            int digit = x%10;

            reversed = (reversed * 10) + digit;
            x = x/10;
        }

        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    public static void main(String[] args) {
        // extractNumber(); extract and remove number
        // countAllDigitsOfANumber(); count the lenght of the number
        // reverseNumber();
        checkNumberPalindrome();

    }
}
