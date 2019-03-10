package com.step.assignments.oop_part_1.Arrays;

import java.util.Arrays;

public class SortingInteger {

    private int []numbers;
    private boolean isAscending;

    public SortingInteger(int []numbers, boolean isAscending) {
        this.numbers = numbers;
        this.isAscending = isAscending;
    }

    public int[] getAscendingOrderedArray() {
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public int[] getDescendingOrderedArray() {
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public void printArray() {
        for (int i = 0; i <this.numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void getSortedArray() {
        if(this.isAscending) {
            System.out.println("Ascending order:");
            this.getAscendingOrderedArray();
            this.printArray();
        }
        else {
            System.out.println("Descending order:");
            this.getDescendingOrderedArray();
            this.printArray();
        }
    }

    public static void main(String[] args) {
        int []numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 3;
        numbers[3] = 7;
        numbers[4] = 2;

        SortingInteger ascendingNumbers = new SortingInteger(numbers, true);
        ascendingNumbers.getSortedArray();

        SortingInteger descendingNumbers = new SortingInteger(numbers, false);
        descendingNumbers.getSortedArray();
    }
}
