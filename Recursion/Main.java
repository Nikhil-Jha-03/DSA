import java.util.ArrayList;
import java.util.List;

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
    // int[] reverseAnArrayM1(int left, int right, int arr[]) {
    //     if (left > right) {
    //         return arr;
    //     }
    //     int temp = arr[left];
    //     arr[left] = arr[right];
    //     arr[right] = temp;
    //     reverseAnArray(left + 1, right - 1, arr);
    //     return arr;
    // }

    int[] reverseAnArrayM2(int i, int n, int arr[]) {
        // System.out.println(arr);
        if (i > n/2) {
            return arr;
        }

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        reverseAnArrayM2(i + 1, n, arr);

        return arr;
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
        int arr[] = { 2, 3, 4, 6, 8 };
        // int result[] = mn.reverseAnArrayM1(0, arr.length - 1, arr);
        int result[] = mn.reverseAnArrayM2(0, arr.length, arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        // System.out.println(result);
    }

}