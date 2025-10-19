package ProjectsExercices;


import java.util.*;

public class wordReversal {
    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
        
    }
    

    public static void main(String[] args) {
        System.out.println(reverseWords("Dog bites man")); // Output: man bites Dog
    }

}
