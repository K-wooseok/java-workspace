package section07;

public class Ex0703 {
    public static void main(String[] args) {
        char[] words = { '1', 'J', '2', 'A', '3', 'V', '4', 'A' };
        String resultWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i] >= 65 && words[i] <= 90) {
                resultWord += words[i];
            }
        }

        for (int word : words) {
            if (word >= 65 && word <= 90) {
                resultWord += (char) word;
            }
        }
        System.out.println(resultWord);
    }
}
