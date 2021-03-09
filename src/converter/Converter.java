package converter;

public class Converter {

    public static int rubleToEuro(int value) {
//        int rsl = value / 70;
        return value / 70;
    }

    public static int rubleToDollar(int value) {
//        int rsl = value / 60;
        return value / 60;
    }

    public static int euroToRub(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        System.out.println("180 rubles are " + Converter.rubleToDollar(180) + " USD");
        System.out.println("210 USD are " + Converter.dollarToRuble(210) + " RUB");
        System.out.println("210 euro are " + Converter.euroToRub(210) + " RUB");

    }
}
