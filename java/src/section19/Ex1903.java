package section19;

public class Ex1903 {
    static int getDigitCount(int n) {
        int count = 0;
        while (true) {
            if (n == 0) {
                break;
            }
            n = n / 10;
            count++;
        }
        return count;
    }

    static int getDigitCount2(int n) {
        String strNumber = "" + n;

        return strNumber.length();
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(6));
        System.out.println(getDigitCount(23));
        System.out.println(getDigitCount(876));
        System.out.println(getDigitCount(7876));

        System.out.println();

        System.out.println(getDigitCount2(6));
        System.out.println(getDigitCount2(23));
        System.out.println(getDigitCount2(876));
        System.out.println(getDigitCount2(7876));
    }
}
