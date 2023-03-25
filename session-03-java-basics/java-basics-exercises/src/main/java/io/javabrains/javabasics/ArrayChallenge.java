package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers;
        int[] numbers = {10, 20, 30, 15, 17, 45};
        int largest = numbers[0];
        int sum = 0;

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

            if (largest < numbers[i])
                largest = numbers[i];

        }

        double avg = (double) sum / numbers.length;
        System.out.println("Sum is : " + sum);
        System.out.println("Average = " + avg);
        System.out.println("largest number in array is : " + largest);
    }
}
