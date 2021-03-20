package array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        if (money > price) {
            int change = money - price;
            for (int i = 0; i < coins.length; i++) {
                while (change - coins[i] >= 0) {
                    rsl[size] = coins[i];
                    change = change - coins[i];
                    size++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
