package com.arthimetic;

import java.util.Arrays;

public class ArthmeticOperation {
    public static void main(String[] args) {
        int a = 15;
        int b= 15;
        int c=20;
        int d = (a+b*c);
        int e = (c+a/b);
        int f = (a%b+c);
        int g = (a*b+c);
        System.out.println("a+b*c = "+d);
        System.out.println("c+a/b = "+e);
        System.out.println("a%b+c = "+f);
        System.out.println("a*b+c = "+g);
        int[] numbers = {d,e,f,g};
        Arrays.sort(numbers);
        System.out.println("Minimum value is "+numbers[0]);
        System.out.println("Maximum value is "+numbers[numbers.length-1]);
    }
}
