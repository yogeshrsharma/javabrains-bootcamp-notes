package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {
        private int width;
        private int height;
        static int numOfRectangles;

    public StaticChallenge(int width, int height) {
        this.width = width;
        this.height = height;
        getNumOfRectangles ();
    }

    public static void main(String[] args) {
        StaticChallenge rec1 = new StaticChallenge(10,11);
        StaticChallenge rec2 = new StaticChallenge(4,5);
        int area1 = rec1.getArea();
        int area2 = rec2.getArea();
        int Peri1 = rec1.getPerimeter();
        int Peri2 = rec2.getPerimeter();
        int numberOfRectangles = numOfRectangles;

        System.out.println("Areas are : " + area1 + "and " + area2);
        System.out.println("Perimeters are : " + Peri1 + "and " + Peri2);
        System.out.println("Number of rectangles are : " + numberOfRectangles);

    }
    public int getArea () {
        int area = width * height;
        return area;
    }

    public int getPerimeter () {
        int peri = 2 * (width + height);
        return peri;
    }

    public int getNumOfRectangles () {
        numOfRectangles++;
        return numOfRectangles;
    }
}
