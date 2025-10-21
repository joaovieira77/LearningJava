import java.util.*;

public class primeFactorization {
    public static List<Integer> factors(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                result.add(i);
                n /= i;
            }
        }
        if (n > 1) result.add(n);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factors(84)); // [2, 2, 3, 7]
    }
}

