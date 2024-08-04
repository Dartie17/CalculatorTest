public class Calculator {

    public int add(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }
    public int square(int a) {
        return a * a;
    }
}