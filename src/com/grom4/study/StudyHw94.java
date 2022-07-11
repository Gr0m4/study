package com.grom4.study;

public class StudyHw94 {
    public static void main(String[] args) {
        int count = 1;
        int k=21;
        String str="";
        for (int i = 1; i <= k; i++) {
            str+=i+"\t";
            if (count == 5) {
                str+="\r\n";
                count = 0;
            }
            count++;
        }
        System.out.println(str);
    }
}
