
public class RecursiveArithmatics {
    public static void main(String[] args) {
        System.out.println(new RecursiveArithmatics().subtract(6, 7));
    }

    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        return add(a + 1, b - 1);
    }

    public int subtract(int a, int b) {
        if (b == 0) {
            return a;
        }
        return subtract(a - 1, b - 1);
    }

    public int multiply(int a, int b) {
        return multiply(a, b, 0);
    }

    public int multiply(int a, int b, int speicher) {
        if (b == 0) {
            return speicher;
        }
        return multiply(a, b - 1, speicher + a);
    }

    public int divide(int a, int b) {
        return divide(a, b, 0);
    }

    public int divide(int a, int b, int speicher) {
        if (a < b) {
            return speicher;
        }
        return divide(a - b, b, speicher + 1);
    }
}
