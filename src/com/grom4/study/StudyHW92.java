package com.grom4.study;

public class StudyHW92 {

    public static void main(String args[]) {
        int large, small, i;
        int a[] = new int[]{234, 4, 452, 4623, 5, 25, 5, 52, 5, 5999, 111111, 999999};
        int n = a.length;
        large = small = a[1];
        for (i = 1; i < n; ++i) {
            if (a[i] > large)
                large = a[i];
            if (a[i] < small)
                small = a[i];
        }
        System.out.print("\nThe smallest element is " + small);
        System.out.print("\nThe largest element is " + large);
    }
}

