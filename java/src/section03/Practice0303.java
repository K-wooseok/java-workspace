package section03;

public class Practice0303 {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;

        boolean andResult = bool1 && bool2;
        boolean orResult = bool1 || bool2;
        boolean notBool1 = !bool1;
        boolean notBool2 = !bool2;

        System.out.println("bool1 AND bool2\t: " + andResult);
        System.out.println("bool1 OR bool2\t: " + orResult);
        System.out.println("NOT bool1\t: " + notBool1);
        System.out.println("NOT bool2\t: " + notBool2);
    }
}