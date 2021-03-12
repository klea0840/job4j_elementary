package condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (third >= second && third >= first) {
            result = third;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ThreeMax.max(-8, 45, 3));
    }
}
