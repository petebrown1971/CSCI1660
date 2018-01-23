package com.petebrown_week1;

public class Main {

    public static void main(String[] args) {
        //Set city name
        String cityName = "Columbus";

        //Set zip code
        int zipCode = 43235 ;

        //Set array of high temperature
        int[] dailyHighs = {50, 60, 55, 45, 30};

        //Calculate average high temperature
        int averageHigh = ((dailyHighs[0] + dailyHighs[1] + dailyHighs[2] + dailyHighs[3] + dailyHighs[4]) / 5);

        //Print city name
        System.out.println("The current city is: " + cityName);

        //Print zipcode
        System.out.println("Zip Code: " + zipCode);

        //Print Average High Temp
        System.out.println("Average Daily High Temperature is " + averageHigh);}

}
