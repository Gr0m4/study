package com.grom4.study;

import java.util.Arrays;

public class StudyHw91 {
    public static void main(String[] args) {
        StudyHw91 s = new StudyHw91();
        double[] a = new double[]{2, 4, 6, 8, 9, 3};
        double[] b = new double[]{8, 9, 3};
        int sizeA = a.length;
        int sizeB = b.length;
        boolean result = false;
        // Define what out of arrays is smaller for using as sub array
        if (sizeA >= sizeB) {
            result = s.isSubArray(a, b);
        } else {
            result = s.isSubArray(b, a);
        }
        System.out.println(result);
    }

    /**
     * Find right sequensities
     * @param array
     * @param subArray
     * @return boolean
     */
    public boolean isSubArray(double[] array, double[] subArray) {
        int size = subArray.length;

        for (int i = 0; i < array.length; i++) {
            if (i + size > array.length) {
                return false;
            } else {
                double[] arrayForEquals = createArray(array, i, size);
                if (Arrays.equals(arrayForEquals, subArray)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Create subarray manually
     * @param array
     * @param i
     * @param size
     * @return double[]
     */
    private double[] createArray(double[] array, int i, int size) {
        double[] subArray = new double[size];
        int c = 0;
        for (int k = i; k < i + size; k++) {
            subArray[c] = array[k];
            c++;
        }
        return subArray;
    }
}
