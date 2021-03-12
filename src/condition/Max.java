package condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int check1 = Max.max(5, 20);
        System.out.println(check1);
        int check2 = Max.max(0, 0);
        System.out.println(check2);
        int check3 = Max.max(50, 20);
        System.out.println(check3);
        int check4 = Max.max(510, 510);
        System.out.println(check4);

    }
}
