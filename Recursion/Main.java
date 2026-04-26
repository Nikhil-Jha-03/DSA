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

   
    public static void main(String[] args) {
        Main mn = new Main();
        // mn.printNumberNtimes(0);
        // mn.printNameNTimes("Nikhil", 0, 5);
        // mn.print1toN(1, 5);
        // mn.printNto1(5);
        // mn.print1ToNBacktracking(5);
        // mn.printNto1Backtracking(5,1);
       
    }

}