package io.javabrains.Assignments_Module2;

import java.util.Scanner;

public class BasicSyntax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : " );
        int a = sc.nextInt();
        System.out.println("Enter second number : " );
        int b = sc.nextInt();
        int sum = a + b;
        int mult = a * b;
        int diff = a > b ? a-b : b - a;
        int div =  a >b ? a/b : b /a;
        int Remain =  a >b ? a % b : b % a;
        System.out.println("Sum is : " + sum + "multiplication is : " + mult +
                "difference is : " + diff + "division is : " + div + "Remainder is : " + Remain);

    }

}
