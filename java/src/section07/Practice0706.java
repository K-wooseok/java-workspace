package section07;

public class Practice0706 {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        int[][] arrs = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                System.out.print(arrs[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] arr : arrs) {
            for (int number : arr) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
