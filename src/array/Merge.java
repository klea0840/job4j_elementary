package array;

import java.util.Arrays;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int countLeft = 0;
        int countRight = 0;
        int countRsl = 0;
        while (countLeft + countRight != rsl.length) {
            if (countLeft != left.length && countRight != right.length) {
                rsl[countRsl++] = left[countLeft] < right[countRight] ? left[countLeft++] : right[countRight++];
            } else if (countLeft != left.length) {
                rsl[countRsl++] = left[countLeft++];
            } else {
                rsl[countRsl++] = right[countRight++];
            }
        }
        return rsl;
            }
        }

