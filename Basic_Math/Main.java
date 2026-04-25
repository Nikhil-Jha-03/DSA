import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
            int digit = x % 10;

            reversed = (reversed * 10) + digit;
            x = x / 10;
        }

        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    static void isArmstrongNumber() {
        int x = 9474;
        int num = x;
        int result = 0;
        // int count = String.valueOf(x).length(); // can also do something like this

        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }

        num = x;

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, count);
            num = num / 10;
        }

        if (x == result) {
            System.out.println("Is ArmStrong");
        } else {
            System.out.println("Not ArmStrong");
        }
    }

    static void printAllDivisorsOfGivenNumber() {

        // initally if we loop till num time which has time complexity of O(n),
        // So if we have 10000 , the loop run for that much time
        // Therefore we use square root time to run the loop
        // So what happens here is loop goes for sqrt(num) --> 36 -->6
        // 1st it check if num % i == 0 then in the same iteration it is check that if
        // the num / i != i
        // if not then the number is added generally it is from the back eg. num / i(1)
        // = 36 and push it to the array

        // current time complexity is O(squrt(n))
        int num = 36;
        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            System.out.println(i);
            if (num % i == 0) {
                // arr.add(i);
                if (num / i != i) {
                    System.out.println(num / i);
                    arr.add(num / i);
                }
            }
        }

        Collections.sort(arr);

        System.out.println(arr);

    }

    static void checkForPrimeNumber() {
        int num = 14;
        int count = 0;

        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                if (num % i != i) {
                    count++;
                }
            }

            
        }

        if (count == 2) {
            System.out.println("Is Prime");
        } else {
            System.out.println("Not Prime");
        }

    }

    static void gcd(){
        int a = 20;
        int b = 40;

        while(a > 0 && b > 0){
            if (a>b) {
                a = a%b;
            } else {
                b = b%a;
            }
        }

        if (a == 0) {
            System.out.print(b);
        }

        System.err.println(a);
        
    }



    public static void main(String[] args) {
        // extractNumber(); extract and remove number
        // countAllDigitsOfANumber(); count the lenght of the number
        // reverseNumber();
        // checkNumberPalindrome();
        // isArmstrongNumber();
        // printAllDivisorsOfGivenNumber();
        // checkForPrimeNumber();
        gcd();
    }
}
