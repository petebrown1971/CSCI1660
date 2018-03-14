package com.petebrown.Week6;

import java.io.IOException;
import java.util.Scanner;

class UserInput {

    public static int promptInt(String number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(number);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + number);
                userInput = scanner.nextLine();
            }
        }

        return userInt;
    }

    public static String promptString(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name);
        String input = scanner.nextLine();

        boolean isString = false;
        while (!isString) {
            try {
                for (int i = 0; i < name.length(); i++) {
                    if (Character.isLetter(name.charAt(i)))
                        isString = true;
                }
            }

            catch (IOException e) {
                System.out.println(input + "is not a String. Please input a string.");
                input = scanner.nextLine();
                        }
            }
            return name;
        }


    public static double promptDouble(String n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(n);
        String doubleinput = scanner.nextLine();

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(doubleinput);
                isDouble = true;
            } catch (NumberFormatException e) {
                System.out.println(doubleinput + " is not a valid double. ");
                doubleinput = scanner.nextLine();
            }
        }

        return userDouble;
    }
}

public class Main {
    public static void main(String[] args) {
        UserInput.promptInt("Enter Int");
        UserInput.promptString("Enter String");
        UserInput.promptDouble("Enter Double");
    }
}

