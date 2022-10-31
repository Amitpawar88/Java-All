import java.util.ArrayList;
import java.util.Arrays;

public class MinCoins {
    public static void main(String[] args) {
        int coins[] = {10, 1, 20, 2, 5, 50, 100, 500, 2000};

        Arrays.sort(coins);

        int countOfCoins = 0;
        int amount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] < amount) {
                while (coins[i] <= amount) {
                    ans.add(coins[i]);
                    countOfCoins++;
                    amount -= coins[i];
                }
            }
        }

        System.out.println("total " + countOfCoins + " coins which are = " + ans);
    }
}
