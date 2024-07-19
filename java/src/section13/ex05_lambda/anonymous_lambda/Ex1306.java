package section13.ex05_lambda.anonymous_lambda;

@FunctionalInterface
interface Calculater {
    int calculator(int a, int b);
}

@FunctionalInterface
interface AbsoluteCalculater {
    int calculator(int a);
}

public class Ex1306 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        Calculater add = (int a, int b) -> {
            return a + b;
        };

        System.out.println("add: " + add.calculator(num1, num2));

        Calculater sub = (a, b) -> {
            return a - b;
        };

        System.out.println("sub: " + sub.calculator(num1, num2));

        Calculater mul = (a, b) -> a * b;

        System.out.println("mul: " + mul.calculator(num1, num2));

        Calculater div = (a, b) -> {
            System.out.println("마지막 계산은 나누기");
            return a / b;
        };

        System.out.println("div: " + div.calculator(num1, num2));

        int number = -10;
        AbsoluteCalculater abs1 = (a) -> a < 0 ? -a : a;
        System.out.println("abs1: " + abs1.calculator(number));

        AbsoluteCalculater abs2 = (a) -> {
            int newNumber = a < 0 ? -a : a;
            return newNumber;
        };
        System.out.println("abs2: " + abs2.calculator(number));
    }
}
