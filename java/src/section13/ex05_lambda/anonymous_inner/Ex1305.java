package section13.ex05_lambda.anonymous_inner;

interface Calculater {
    int calculator(int a, int b);
}

public class Ex1305 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        Calculater add = new Calculater() {
            @Override
            public int calculator(int a, int b) {
                return a + b;
            }
        };

        System.out.println("add: " + add.calculator(num1, num2));

        Calculater sub = new Calculater() {
            @Override
            public int calculator(int a, int b) {
                return a - b;
            }
        };

        System.out.println("sub: " + sub.calculator(num1, num2));

        Calculater mul = new Calculater() {
            @Override
            public int calculator(int a, int b) {
                return a * b;
            }
        };

        System.out.println("mul: " + mul.calculator(num1, num2));

        Calculater div = new Calculater() {
            @Override
            public int calculator(int a, int b) {
                return a / b;
            }
        };

        System.out.println("div: " + div.calculator(num1, num2));
    }
}
