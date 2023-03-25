package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
            int a = 10;
            int b = 20;

        // Step 2: Perform arithmetic operations
            int sum = a + b;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("sum = " + sum);

        // Step 4: Perform increment and decrement operations
            a = b++;
            b--;
            sum++;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("a = " + a + "b = " + b + "sum = " + ++sum);

        // Step 6: Perform comparison operations
        if (a>b)


        // Step 7: Print the results of the comparison operations
            System.out.println("a is greater");
        else
            System.out.println("b is greater");

        // Step 8: Perform logical operations

            if (a>b && b<a)
        // Step 9: Print the results of the logical operations

                System.out.println("A is greater : " + a );
            else
                System.out.println("B is equal or greater than A and value is : " + b + "and value of A is : " + a);
    }
}
