package array;

public class MatrixSum {

    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
                rsl += array[i][j];
                System.out.println(rsl);
            }
        }
        return rsl;
    }
}
