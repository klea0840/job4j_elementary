package condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is " + result);
        System.out.println("result (1, 1) to (1, 1) is " + Point.distance(3, 5, 2, 4));
        System.out.println("result (2, 2) to (1, 1) is " + Point.distance(2, 2, 1, 1));
        System.out.println("result (3, 1) to (25, 1) is " + Point.distance(3, 1, 25, 25));
        System.out.println("result (-1, -8) to (-15, -25) is " + Point.distance(-1, -8, -15, -25));
    }
}
