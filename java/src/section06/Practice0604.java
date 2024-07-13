package section06;

import java.util.Scanner;

public class Practice0604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dan = 0;

        System.out.print("출력할 구구단의 단을 입력하세요: ");
        dan = scanner.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.println(dan + " x " + (i + 1) + " = " + dan * (i + 1));
        }
        scanner.close();
    }
}
