package section14.practice.p02;

import java.util.Scanner;

public class Practice1402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dividend;
        int divisior;

        System.out.print("피제수를 입력하세요: ");
        dividend = scanner.nextInt();
        System.out.print("제수를 입력하세요: ");
        divisior = scanner.nextInt();
        try {
            System.out.println("나눗셈 결과: " + dividend / divisior);
        } catch (Exception exception) {
            System.out.println(divisior + "로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
            scanner.close();
        }
    }
}
