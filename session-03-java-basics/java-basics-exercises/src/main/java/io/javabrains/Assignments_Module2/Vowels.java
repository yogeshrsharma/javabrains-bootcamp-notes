package io.javabrains.Assignments_Module2;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        System.out.println("Enter the string to count vowels.");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println("The input string is : " + str);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'A'|| str.charAt(i) == 'a'|| str.charAt(i) == 'E'
                    || str.charAt(i) == 'e'|| str.charAt(i) == 'I'|| str.charAt(i) == 'i'
                    || str.charAt(i) == 'O'|| str.charAt(i) == 'o'|| str.charAt(i) == 'U'
                    || str.charAt(i) == 'u'){

                count ++;

        }

        }
        System.out.println("Total number of vowels = "+ count);

    }

}
