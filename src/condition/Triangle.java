package condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ((ab + bc > ac) && (ab + ac > bc) && (bc + ac > ab));
    }

    public static void main(String[] args) {

        System.out.println(Triangle.exist(1, 2, 2));
        System.out.println(Triangle.exist(1, 1, 2));

    }
}
