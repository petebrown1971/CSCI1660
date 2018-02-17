package com.petebrown.week4;

//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;

class HashMapPutExample {

    public static void main(String[] args) {
        Hashtable<String, ArrayList<Double>> names = new Hashtable<>();
        String name = "";
        ArrayList<Double> temp = new ArrayList<>();

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter City:");
                name = in.next();
                if (name.equals("end")) {
                    break;
                }

                Scanner input = new Scanner(System.in);
                double[] avg = new double[5];

                for (int i = 0; i < avg.length; i++) {
                    System.out.println("Please enter an average daily temperature:");
                    avg[i] = input.nextDouble();

                }


            }
        }
    }
 private static double average(ArrayList <Integer> temp) {
         //Calculate the summation of the elements in the list
            long sum = 0;
         double n = temp.size();
        for (double i = 0; i < n; i++)
          sum += temp.get(i);
        return ((double) sum) / n;

        // print the hashtable data
        System.out.println("Hashtable:");
        {
           for (String name : name.keySet())
            System.out.println("Key" + name + "value" + n);
        }
    }
}













