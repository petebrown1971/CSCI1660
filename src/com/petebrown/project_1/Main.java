package com.petebrown.project_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> task = new ArrayList<>(); //declare an Array List as strings
        boolean keepGoing = true;
        while (keepGoing) {

            System.out.println("What would you like to do? (enter number)");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Update a task");
            System.out.println("4. Show me all tasks");
            System.out.println("5. Exit");

            Scanner s1 = new Scanner(System.in);

            int n = s1.nextInt();

            switch (n) {

                case 1:
                    System.out.println("Please add a task.");
                    Scanner sa = new Scanner(System.in);
                    task.add(sa.nextLine());
                    System.out.println("Here is the current list:" );
                    System.out.println(task);
                    break;

                case 2:
                    System.out.println("Select a task to remove from this list:" + task);
                    Scanner sr = new Scanner(System.in);
                    task.remove(sr.nextLine());
                    System.out.println("Here is the current list:" );
                    System.out.println(task);break;

                case 3:
                    System.out.println("Select a task to update from this list:" + task);
                    Scanner su = new Scanner(System.in);
                    task.remove(su.nextLine());
                    System.out.println("Enter the modified task:");
                    Scanner sm = new Scanner(System.in);
                    task.add(sm.nextLine());
                    System.out.println("Here is your updated task list:" + task);
                    break;

                case 4:
                    System.out.println("Here are the current tasks:");
                    System.out.println(task);
                    break;

                case 5:
                    System.out.println("Goodbye.");
                    keepGoing = false;
                    break;

                default:
                    System.out.println("Not a valid choice!\n Please try again...\n");
            }
        }
    }
}

