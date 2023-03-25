package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
            int age = 10;
        // long variable to store a long value
            long prettyLong = 23423423234764L ;
        // float variable to store a floating-point value
            float decimal = 3.1423532f;

        // double variable to store a double value
            double bigDecimal = 3.23543533432442342f;

        // char variable to store a single character
            char onlyCharacter = 'A';

        // boolean variable to store a boolean value
            boolean IsTrue = true;

        // String variable to store a string of characters

            String myData = "That's really cool. 123 action ";
        // Step 2: Print the values of the variables to the console
        System.out.println("int value is "+ age +" long value is "+prettyLong + "float value is "+decimal
                + "double value is " + bigDecimal
                + "character value is " + onlyCharacter+ "boolean is "+ IsTrue + "String is  " + myData);

        // Step 3: Modify the values of the variables and print the updated values

         myData = "This is new data";

        System.out.println( " Updated data is " + myData);

    }
}
