package ProjectsExercices;
import java.util.*;
public class anagrams {
      public static boolean areAnagrams(String a, String b) {
        return sortChars(a).equals(sortChars(b));
    }

    private static String sortChars(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent")); // true
    }
}
