package com.petebrown.week2;

public class Main {
    public static void main(String[] args) {
        // Set array of days of the week
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Set array of high temperatures
        int[] highTemperature = {45, 29, 10, 22, 41, 28, 33};

        // Set array of precipitation probability
        int[] precipProb = {95, 60, 25, 5, 0, 75, 90};

        for (int i = 0; i < days.length; i++) {

            if ((highTemperature[i] < 32) && precipProb[i] > 50)
                System.out.println(days[i] + ": It's going to snow!");
            else
                System.out.println(days[i] + ": It's not going to snow!");
        }

    }
}
