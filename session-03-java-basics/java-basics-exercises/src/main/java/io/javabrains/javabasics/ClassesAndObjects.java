package io.javabrains.javabasics;

/*
1.  Create a class called `Car` with member variables for the make, model, and year of the car.
2.  Create a constructor method for the `Car` class that initializes the member variables.
3.  Create getter methods for the make, model, and year.
4.  Create a `toString` method that returns a string representation of the car in the form "year make model".
5.  In the `main` method of this class, create a `Car` object with a make, model, and year of your choice.
6.  Use the member variables and methods of the `Car` class to print the make, model, and year of the car.
7.  The expected output of the program is:

```
Make: Toyota
Model: Camry
Year: 2020
Details: 2020 Toyota Camry
```

 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassesAndObjects {

    private String carMake ;
    private String carModel;
    private Date yearOfMake;


    public static void main(String[] args) throws ParseException {
        String sDate = "2014/12/01";

        ClassesAndObjects car1 = new ClassesAndObjects("Maruti", "Celerio", new SimpleDateFormat("yyyy/MM/dd").parse(sDate));
        System.out.println("Car make is : "+ car1.carMake + ", Car model is : "+ car1.carModel + ", Car year of make : "+ car1.yearOfMake);
    }

    public ClassesAndObjects(String carMake, String carModel, Date yearOfMake) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.yearOfMake = yearOfMake;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public Date getYearOfMake() {
        return yearOfMake;
    }

    @Override
    public String toString() {
        return "ClassesAndObjects{" +
                "carMake='" + carMake + '\'' +
                ", carModel='" + carModel + '\'' +
                ", yearOfMake=" + yearOfMake +
                '}';
    }
}
