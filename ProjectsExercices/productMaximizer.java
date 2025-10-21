public class productMaximizer {
    public static String maxProduct(int[] arr) {
        int max = Integer.MIN_VALUE, a = 0, b = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++) {
                int prod = arr[i] * arr[j];
                if (prod > max) {
                    max = prod;
                    a = arr[i];
                    b = arr[j];
                }
            }
        return "Max product: " + max + " from " + a + " and " + b;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1, 10, -5, 20})); // Max product: 200 from 10 and 20
    }
}
