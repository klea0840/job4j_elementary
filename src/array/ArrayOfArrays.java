package array;

public class ArrayOfArrays {
    public static void main(String[] args) {
        int[][] array = {{98}, {73, 64}, {12, 51, 38}, {1, 2, 3, 4}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("The length of array element is " + array[i].length);
        }
    }
}
