package section05;

public class Ex0511 {
    public static void main(String[] args) {
        System.out.println("구구단");
        System.out.println("----------");

        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d x %d = %d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
