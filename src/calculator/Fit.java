package calculator;

public class Fit {

        public static double manWeight(short height) {
            return (height - 100) * 1.15;
        }

        public static double womanWeight(short height) {
            double rsl = (height - 110) * 1.15;
            return rsl;
        }

        public static void main(String[] args) {
            short height = 187;
            double man = Fit.manWeight(height);
            System.out.println("Man 187 is " + man);

            double lady = Fit.womanWeight(height);
            System.out.println("Lady 187 is " + lady);
        }

    }
