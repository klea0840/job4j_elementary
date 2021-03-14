package loop;

public class CheckPrimeNumber {

        public static boolean check(int number) {
            boolean prime = false;
            for (int i = 2; i <= number - 1; i++) {
                if (number % i != 0) {
                    prime = true;
                } else {
                    break;
                }
            }
            return prime;
        }
}
