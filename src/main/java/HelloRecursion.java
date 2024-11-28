
public class HelloRecursion {
    public static void main(String[] args) {
        HelloRecursion hr = new HelloRecursion();
        hr.repeat(1, 10);
    }

    public void repeat(int repetitions) {
        System.out.println("Hello " + repetitions);
        if (repetitions > 0) {
            repeat(repetitions - 1);
        }
    }

    public void repeat(int currentRepetitions, int maxRepetitions) {
        System.out.println("Hello " + currentRepetitions);
        if (currentRepetitions < maxRepetitions) {
            repeat(currentRepetitions + 1, maxRepetitions);
        }
    }
}
