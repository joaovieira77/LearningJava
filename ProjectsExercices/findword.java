public class findword {
    public static String findNthWord(String input, int n) {
        String[] words = input.split(" ");
        return (n > 0 && n <= words.length) ? words[n - 1] : "Invalid";
    }

    public static void main(String[] args) {
        System.out.println(findNthWord("I can program in Java", 3)); // Output: program
    }
}
