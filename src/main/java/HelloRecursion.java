public class HelloRecursion {
    public int repetitions;
    public int number;
    public HelloRecursion() {
        repetitions = 5000;
        number = 1;
    }

    public static void main(String[] args) {
        HelloRecursion hr = new HelloRecursion();
        hr.repeat(hr.repetitions, hr.number);
    }
    public static void repeat(int repetitions, int number){
        if (number <= repetitions){
            System.out.println("Hello " + number);
            number++;
            repeat(repetitions,number);
        }
    }
}
