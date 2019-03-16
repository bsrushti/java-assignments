package com.step.assignments.Exceptions;

import java.util.Scanner;

public class inputMismatchException {

    public static int getInt() {
        try {
            Scanner scan = new Scanner(System.in);
            return scan.nextInt();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number :");
        System.out.println(getInt());
    }
}
