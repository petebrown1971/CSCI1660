package com.petebrown.week3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        float temperature;
        do {

            Scanner in = new Scanner(System.in);

            // Input temperature as float

            System.out.println("Enter temperature in Fahrenheit");
            temperature = in.nextInt();

            if (temperature == -460)
                break;

            //Convert Fahrenheit to Celsius

            temperature = ((temperature - 32) * 5) / 9;


            // Display Result

            System.out.println("Temperature in Celsius = " + temperature);


            //Loop program while user input > -460
        }
        while (temperature > -460);
    }

}


