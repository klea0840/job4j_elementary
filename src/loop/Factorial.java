package loop;

public class Factorial {

    public static int calc(int n) {
        int counter = 1;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}