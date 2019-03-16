package com.step.assignments;

public class MinutesAndSeconds {

    public static String getDurationString(int minutes, int seconds) {
        if(!(minutes >= 0 && (seconds >= 0 && seconds <= 59))){
            String errorMessage = "Invalid value";
            return errorMessage;
        }
        int hours = minutes/60;
        minutes = minutes%60;
        seconds = seconds%60;
        String minutesAndSeconds = hours+"h "+minutes+"m "+seconds+"s";
        return minutesAndSeconds;
    }

    public static String getDurationString(int seconds) {
        if(!(seconds >= 0)) {
            return "Invalid value";
        }
        int minutes = seconds/60;
        seconds = seconds%60;
        return getDurationString(minutes, seconds);
    }

    public static void main(String[] args) {
        System.out.println("---------------------------");
        System.out.println(getDurationString(120,20));
        System.out.println(getDurationString(124,10));
        System.out.println(getDurationString(60,3));

        System.out.println("---------------------------");

        System.out.println(getDurationString(60));
        System.out.println(getDurationString(120));
        System.out.println(getDurationString(3));
        System.out.println("---------------------------");

        System.out.println(getDurationString(-5,6));
        System.out.println(getDurationString(9,-3));
        System.out.println(getDurationString(9,64));
        System.out.println(getDurationString(9,9));
        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(61));
        System.out.println(getDurationString(48645900));
        System.out.println("---------------------------");

    }
}


//Hello this is sample text



