package section05;

public class Ex0504 {
    public static void main(String[] args) {
        // 1~10 출력
        int number = 1;
        while (number <= 10) {
            number++;
            if (number % 2 != 0) {
                continue;
            }
            System.out.printf("%d ", number);
        }

    }
}
