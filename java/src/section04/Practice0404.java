package section04;

public class Practice0404 {
    public static void main(String[] args) {
        // DB에 존재하는 사용자
        String isUsername = "admin";
        String isPassword = "password123";

        String username = "admin";
        String password = "password123";

        if (username.equals(isUsername) && password.equals(isPassword)) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
