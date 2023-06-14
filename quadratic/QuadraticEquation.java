package com.quadratic;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.print("Enter the values of a ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the value of b ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c ");
        int c = sc.nextInt();
        int d = b*b - 4*a*c;
        if(d>0){
            double r1 = (-b+Math.pow(d,0.5))/(2*a);
            double r2 = (-b-Math.pow(d,0.5))/(2*a);
            System.out.println("The roots are" +r1+" and "+r2);
        }else if(d==0){
            double r1 = -b/(2*a);
            System.out.println("The root is "+r1);
        }else{
            System.out.println("Roots are not valid");
        }
    }
}
