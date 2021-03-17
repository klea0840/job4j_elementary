package array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length - 1; i++) {
            boolean rls = data[0];
            if (rls != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
