package array;

public class ArrayDefinition {

    public static void main(String[] args) {

        short[] ages = new short[10];
        System.out.println("The length of ages: " + ages.length);

        String[] surnames = new String[100500];
        System.out.println("The length of surnames: " + surnames.length);

        float[] prices = new float[40];
        System.out.println("The length of prices: " + prices.length);

        String[] names = new String[4];
        names[0] = "Geralt";
        names[1] = "Regis";
        names[2] = "Plotva";
        names[3] = "Milva";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
