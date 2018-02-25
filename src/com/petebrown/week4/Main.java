package com.petebrown.week4;

import java.util.HashMap;
import java.util.Scanner;


class Main {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        String name = "";
        String temperatures;

        try (Scanner in = new Scanner(System.in)) {
            while (!name.equals("end")) {
                System.out.println("Enter City:");
                name = in.next();
                if (name.equals("end")) break;

                System.out.println("Please enter 5 average daily temperatures with a comma between each:");
                temperatures = in.next();
                hashmap.put(name, temperatures);
            }
        }
        display(hashmap);

    }


    public static void display(HashMap<String, String> average) {
        for (String key : average.keySet()) {
            System.out.println("City: " + key);
            int sum = 0;

            for (String temps : average.get(key).split(",")) {
                    Integer n = Integer.parseInt(temps);
                    sum += n;}

                System.out.println("The Average is: " + sum / 5);  // print the result.

            }


        }


    }























