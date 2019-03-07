package com.step.assignments;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour /1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}

/*
1
2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.

This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.

Then it needs to print a message in the format "XX km/h = YY mi/h".

XX represents the original value kilometersPerHour.
YY represents the rounded milesPerHour from the kilometersPerHour parameter.

If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".


Examples of input/output:
* printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
* printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
* printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
* printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
* printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h


Use method Math.round to round the number of calculated miles per hour(double). The method round returns long.


How to use the method round and how it works?

The Math.round() is a built-in math method which returns the closest long to the argument. The result is rounded to an integer by adding 1/2, taking the floor of the result after adding 1/2, and typecasting the result to type long. The method returns the value of the argument rounded to the nearest int value.

USAGE EXAMPLE:

double number = 1.5;
long rounded = Math.round(number);
System.out.println("rounded= " + rounded);
System.out.println("with 3.9= " + Math.round(3.9));
System.out.println("with 4.5= " + Math.round(4.5));
int sum = 45;
int count = 10;
// typecasting so result is double e.g. double / int -> double
double average = (double) sum / count;
long roundedAverage = Math.round(average);
System.out.println("average= " + average);
System.out.println("roundedAverage= " + roundedAverage);


OUTPUT:

rounded= 2
with 3.9= 4
with 4.5= 5
average= 4.5
roundedAverage= 5


* */