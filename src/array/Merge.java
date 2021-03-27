package array;

import java.util.Arrays;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int countLeft = 0;
        int countRight = 0;
        int countRsl = 0;
        while (countLeft < left.length && countRight < right.length) {
            if (left[countLeft] < right[countRight]) {
                rsl[countRsl] = left[countLeft];
                countLeft++;
            } else {
                rsl[countRsl] = right[countRight];
                countRight++;
            }
            countRsl++;
        }
            if (countLeft < left.length) {
                for (int i = countLeft; i < left.length; i++) {
                    rsl[countRsl] = left[i];
                    countRsl++;
                }
            }
            if (countRight < right.length) {
                for (int i = countRight; i < right.length; i++) {
                    rsl[countRsl] = right[i];
                    countRsl++;
                }
            }
        return rsl;
            }
        }

