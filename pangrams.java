import java.util.*;

public class pangrams {
    public static boolean isPangram(String input) {
        Set<Character> letters = new HashSet<>();
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) letters.add(c);
        }
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // true
    }
}
