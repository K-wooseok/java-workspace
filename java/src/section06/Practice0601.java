package section06;

import java.util.Scanner;

public class Practice0601 {
    public static void main(String[] args) {
        /*
         * 숫자를 입력하세요 (종료: 0): 1
         * 숫자를 입력하세요 (종료: 0): 2
         * 숫자를 입력하세요 (종료: 0): 3
         * 숫자를 입력하세요 (종료: 0): 4
         * 숫자를 입력하세요 (종료: 0): 5
         * 숫자를 입력하세요 (종료: 0): 0
         * 입력된 숫자들의 합 : 15ㅊ
         */
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("숫자를 입력하세요 (종료: 0): ");
        number = scanner.nextInt();
        while (number != 0) {
            sum += number;
            System.out.print("숫자를 입력하세요 (종료: 0): ");
            number = scanner.nextInt();
        }

        System.out.println("입력된 숫자들의 합 : " + sum);
        scanner.close();
    }
}
