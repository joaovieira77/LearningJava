import java.util.regex.*;
public class wordSearch {
    public static boolean startsWithWord(String input, String word) {
        return input.startsWith(word);
    }

    public static int countWordOccurrences(String input, String word) {
        Matcher matcher = Pattern.compile("\\b" + Pattern.quote(word) + "\\b").matcher(input);
        int count = 0;
        while (matcher.find()) count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(startsWithWord("hello world", "hello")); // true
        System.out.println(countWordOccurrences("I'm the new newt", "new")); // 2
    }
}
