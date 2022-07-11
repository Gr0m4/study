package com.grom4.study;

public class StudyHw93 {
    public static void main(String[] args) {
        int[] array=new int[]{23,45,666,78,99,10,13};
        new StudyHw93().fingUniqNumbers(array);
    }

    public void fingUniqNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(!isNotUniqNumber(array[i])){
                System.out.println(array[i]);
            }
        }
    }

    public boolean isNotUniqNumber(int number) {
        int prev = 0;
        int current = 0;
        boolean res = false;
        int i = 0;
        while (number > 0) {
            if (i > 0) {
                current = number % 10;
                if (current == prev) {
                    return true;
                }
                number = number / 10;
                prev = current;
            }
            i++;
        }
        return res;
    }
}
