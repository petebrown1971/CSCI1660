package com.petebrown.week4;

//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Hashtable;

class HashMapPutExample {

    public static void main(String[] args) {
        Hashtable<String, ArrayList<Integer>> names = new Hashtable<>();
        String name = "";
        ArrayList<Integer> temp = new ArrayList<>();

        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter City:");
                name = in.next();
                if (name.equals("end")) {
                    break;


                    System.out.println("Enter Monday Average Temp:");
                    Scanner mon = new Scanner(System.in);
                    temp.add(mon.nextLine());

                    System.out.println("Enter Tuesday Average Temp:");
                    Scanner tue = new Scanner(System.in);
                    temp.add(tue.nextLine());

                    System.out.println("Enter Wednesday Average Temp:");
                    Scanner wed = new Scanner(System.in);
                    temp.add(wed.nextLine());

                    System.out.println("Enter Thursday Average Temp:");
                    Scanner thu = new Scanner(System.in);
                    temp.add(thu.nextLine());

                    System.out.println("Enter Friday Average Temp:");
                    Scanner fri = new Scanner(System.in);
                    temp.add(fri.nextLine());

                }
            }
        }
    }
            private static double average(ArrayList <Integer> temp) {
                // Calculate the summation of the elements in the list
                long sum = 0;
                int n = temp.size();
                for (int i = 0; i < n; i++)
                    sum += temp.get(i);
                return ((double) sum) / n;


                // print the hashtable data
                System.out.println("Hashtable:");
                {

                    for (String n : names.keySet())
                        System.out.println("City:" + name + "Average Temp:" + average);
                }
            }
}



