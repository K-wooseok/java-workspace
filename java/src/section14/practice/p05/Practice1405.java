package section14.practice.p05;

import java.util.Scanner;

class AgeException extends Exception {
    private String message;

    public AgeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "에러 발생: " + this.message;
    }
}

public class Practice1405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("나이를 입력하세요: ");
        age = scanner.nextInt();

        try {
            checkAge(age);
            System.out.println("정상적인 처리: " + age + "세입니다.");
        } catch (AgeException exception) {
            System.out.println(exception.getMessage());
        } finally {
            scanner.close();
        }
    }

    static void checkAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("음수 나이는 입력할 수 없습니다.");
        }
    }
}
