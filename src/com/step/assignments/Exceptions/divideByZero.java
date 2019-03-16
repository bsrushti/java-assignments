package com.step.assignments.Exceptions;

public class divideByZero {

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(3,3));
        System.out.println(divide(3,0));
    }
}
