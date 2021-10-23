import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Soru2 {

    public static int getMaxBooks(int[] prices, int budget) {
        ArrayList<Integer> sortedPrices = Arrays.stream(prices).boxed().collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(sortedPrices);
        int result = 0;
        for (Integer price : sortedPrices) {
            budget -= price;
            if (budget >= 0) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{10, 40, 50, 30, 20, 10, 60};
        int budget = 60;
        int maxBooks = getMaxBooks(prices, budget);
        System.out.printf("maxBooks: %d%n", maxBooks);
    }
}
