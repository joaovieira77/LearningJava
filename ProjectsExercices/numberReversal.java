
public class numberReversal {
    public static String reverse(String input) {
        if (input.contains(".")) {
            String[] parts = input.split("\\.");
            return new StringBuilder(parts[0]).reverse() + "." + new StringBuilder(parts[1]).reverse();
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("193.56")); 
    }
}
