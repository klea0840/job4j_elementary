package converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRub(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {

        int in = 140;
        int euro = Converter.rubleToEuro(in);
        System.out.println("140 rubles are " + euro + " euro.");

        int in2 = 180;
        int out2 = Converter.rubleToDollar(in2);
        System.out.println("180 rubles are " + out2 + " USD");

        int in3 = 210;
        int out3 = Converter.dollarToRuble(in3);
        int out4 = Converter.euroToRub(in3);
        System.out.println("210 USD are " + out3 + " RUB");
        System.out.println("210 euro are " + out4 + " RUB");

        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int expected2 = 3;
        boolean passed2 = expected2 == out2;
        System.out.println("180 rubles are 3. Test result : " + passed2);

        int expected3 = 12600;
        boolean passed3 = expected3 == out3;
        System.out.println("210 USD are 12600. Test result : " + passed3);

        int expected4 = 14700;
        boolean passed4 = expected4 == out4;
        System.out.println("210 euro are 14700. Test result : " + passed4);

    }
}
