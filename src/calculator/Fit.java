package calculator;

public class Fit {

        public static double manWeight(short height) {
            return (height - 100) * 1.15;
        }

        public static double womanWeight(short height) {
            return (height - 110) * 1.15;
        }

        public static void main(String[] args) {
            short height = 187;
            System.out.println("Man 187 is " + Fit.manWeight(height));

            System.out.println("Lady 187 is " + Fit.womanWeight(height));
        }

    }
