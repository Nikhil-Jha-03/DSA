public class Main {

    void printNumberNtimes(int num) {
        if (num == 10) {
            return;
        }
        num++;
        System.out.println(num);
        printNumberNtimes(num);
    }

    void printNameNTimes(String name, int count, int num) {
        // Time and Space Complexity is O(n)

        if (count > num) {
            return;
        }
        System.out.println(name);
        count++;
        printNameNTimes(name, count, num);
    }

    void print1toN(int count, int num) {
        // Time and Space Complexity is O(n)

        if (count > num) {
            return;
        }

        System.out.print(count + ", ");
        count++;
        print1toN(count, num);
    }

    void printNto1(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNto1(n - 1);
    }

    void print1ToNBacktracking(int i) {
        if (i < 1) {
            return;
        }
        print1ToNBacktracking(i - 1);
        System.out.println(i);
    }

    void printNto1Backtracking(int i, int n) {
        if (n > i) {
            return;
        }
        printNto1Backtracking(i, n + 1);
        System.out.println(n);
    }

    int sumOfFirstNNumbers(int count, int n, int sum) {

        // For Functional Recurion we use int as return instead of void

        // With Backtracking and parameterized recursion
        // if (n < 1) {
        // System.out.println(sum);
        // return;
        // }
        // sumOfFirstNNumbers(count, n - 1, sum+n);

        // Without BackTracking and parameterized recursion
        // if (count >= n) {
        // System.out.println(sum);
        // return;
        // }
        // count++;
        // sum = sum + count;
        // sumOfFirstNNumbers(count, n, sum);

        // Using Functional Recurion
        // only n is required
        if (n == 0) {
            return 0;
        }

        return n + sumOfFirstNNumbers(count, n - 1, sum);

    }

    int factorialOfN(int n) {
        // Time and Space Complexity = O(N)
        if (n == 0) {
            return 1;
        }

        return n * factorialOfN(n - 1);
    }

    // Method 1
    int[] reverseAnArrayM1(int left, int right, int arr[]) {
        if (left > right) {
            return arr;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseAnArrayM1(left + 1, right - 1, arr);
        return arr;
    }

    // Method 2
    int[] reverseAnArrayM2(int i, int n, int arr[]) {
        // System.out.println(arr);
        if (i > n / 2) {
            return arr;
        }

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverseAnArrayM2(i + 1, n, arr);

        return arr;
    }

    String stringPalindrome(String data) {

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == data.charAt(data.length() - i - 1)) {
                System.out.println("Palidrome");
                return "";
            } else {
                System.out.println(" not Palidrome");
                return "";
            }
        }

        return "";

    }

    boolean stringPalindrome(int i, String data) {
        System.out.println(i);
        if (i > data.length() / 2)
            return true;
        if (data.charAt(i) != data.charAt(data.length() - i - 1))
            return false;

        return stringPalindrome(i + 1, data);
        // what can be done is

        // loop till length/2 and create var half for the loop lenght and see if
        // string.length() - (2*i) -1 or something work
    }

   
    boolean checkStringPalindromeUsingTwoPointer125(String text) {

    //      boolean checkStringPalindromeWithAscii(String text) {
    //     String newText = "";
    //     for (int i = 0; i < text.length(); i++) {
    //         if ((int) text.charAt(i) >= (int) 'A' && (int) text.charAt(i) <= (int) 'z') {
    //             newText = newText + text.charAt(i);
    //         }
    //     }
    //     newText = newText.toLowerCase();
    //     for (int j = 0; j < newText.length(); j++) {
    //         if (newText.charAt(j) != newText.charAt(newText.length() - j - 1)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }


        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            char curentLeftChar = text.charAt(left);
            char curentRightChar = text.charAt(right);
            if (!Character.isLetterOrDigit(curentLeftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(curentRightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(curentLeftChar) != Character.toLowerCase(curentRightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Main mn = new Main();
        // mn.printNumberNtimes(0);
        // mn.printNameNTimes("Nikhil", 0, 5);
        // mn.print1toN(1, 5);
        // mn.printNto1(5);
        // mn.print1ToNBacktracking(5);
        // mn.printNto1Backtracking(5,1);
        // int result = mn.sumOfFirstNNumbers(0, 5, 0);
        // int result = mn.factorialOfN(5);
        // int arr[] = { 2, 3, 4, 6, 8 };
        // int result[] = mn.reverseAnArrayM1(0, arr.length - 1, arr);
        // int result[] = mn.reverseAnArrayM2(0, arr.length, arr);
        // for (int i = 0; i < result.length; i++) {
        // System.out.println(result[i]);
        // }

        // String result = mn.stringPalindrome("madam");
        // boolean result = mn.stringPalindrome(0, "madam");

        boolean result = mn.checkStringPalindromeUsingTwoPointer125("A man, a plan, a canal: Panama");
        System.out.println(result);

        // System.out.println(result);
    }

}