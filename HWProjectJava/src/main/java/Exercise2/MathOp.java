package Exercise2;

public class MathOp {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("a + b = " + sum(a, b));
        System.out.println("a - b = " + subtract(a, b));
        System.out.println("a * b = " + multiply(a, b));
        System.out.println("a / b = " + divide(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return a / b;
    }
}
