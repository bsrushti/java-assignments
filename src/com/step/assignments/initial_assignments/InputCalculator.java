package com.step.assignments;


import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        int sum = 0, count =0;
        while (scan.hasNext()) {
            if(!scan.hasNextInt()) break;
            count++;
            sum = sum + scan.nextInt();
        }
        System.out.println("SUM = "+sum + " AVG = "+ (Math.round((float)sum/count)));
    }
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
