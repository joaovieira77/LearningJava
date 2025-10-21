public class vowelConsonantCounter {
    public static String count(String input) {
        int vowels = 0, consonants = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) vowels++;
            else if (Character.isLetter(c)) consonants++;
        }
        return "Vowels: " + vowels + ", Consonants: " + consonants;
    }

    public static void main(String[] args) {
        System.out.println(count("Im learning java")); 
    }
}
