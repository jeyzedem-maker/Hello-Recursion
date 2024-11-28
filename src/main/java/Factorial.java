
public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.calculate(4));
    }

    public long calculate(long n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculate(n - 1);
    }

    public long calculateSchleife(long n) {
        long ergebnis = 1;

        while (n > 0) {
            ergebnis *= n;
            n--;
        }

        return ergebnis;
    }
}
