
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(new Fibonacci().getFibonacciNumberAt(100));
    }

    void printFibonacciSequence(int fiboPrevious, int fiboCurrent) {
        System.out.println(fiboCurrent);

        if (fiboCurrent < 10000) {
            printFibonacciSequence(fiboCurrent, fiboPrevious + fiboCurrent);
        }
    }

    public int getFibonacciNumberAt(int position) {
        if (position == 1) {
            return 1;
        }
        if (position == 2) {
            return 1;
        }
        return getFibonacciNumberAt(position - 1) + getFibonacciNumberAt(position - 2);
    }
}
