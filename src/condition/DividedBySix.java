package condition;

public class DividedBySix {

    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                rsl = "The number can be divided by 6";
            } else {
                rsl = "The number is not even, but can be divided by 3";
            }
        } else {
            if (number % 2 == 0) {
                rsl = "The number is even, but can't be divided by 3";
            } else {
                rsl = "The number is not even and can't be divided by 3";
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(DividedBySix.checkNumber(25));
        System.out.println(DividedBySix.checkNumber(24));
        System.out.println(DividedBySix.checkNumber(12));
        System.out.println(DividedBySix.checkNumber(0));
    }
}
