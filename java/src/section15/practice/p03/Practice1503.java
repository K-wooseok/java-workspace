package section15.practice.p03;

import java.util.Arrays;

public class Practice1503 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("length: " + str.length());

        String str1 = "Hello";
        String str2 = "hello";
        if (str1.equals(str2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }

        String firstName = "일남";
        String lastName = "김";
        System.out.println(lastName + firstName);

        String str3 = "Hello, World!";
        System.out.println(str3.substring(7, 12));

        String str4 = "Hello, World";
        str4 = str4.replaceAll("o", "0");
        System.out.println(str4);

        String str5 = "Apple, Banana, Cherry";
        String[] fruits = str5.split(", ");
        System.out.println(Arrays.toString(fruits));

        String str6 = "    Hello, world!    ";
        String trimmedStr6 = str6.trim();
        System.out.println(trimmedStr6);
    }
}
