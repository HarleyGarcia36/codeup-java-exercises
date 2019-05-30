package util;

import java.util.Scanner;

public class Input {

    private Scanner input;

    public String getString() {
        return this.input.nextLine();
    }

    public String getString(boolean prompt) {
        System.out.print("Enter a string: ");
        return getString();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }

    public boolean yesNo() {
        String s = this.input.nextLine();
        return "y".equalsIgnoreCase(s) || "yes".equalsIgnoreCase(s);
    }

    public boolean yesNo(boolean prompt) {
        System.out.print("(yes/no) ");
        return yesNo();
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt() {
        try {
            return Integer.parseInt(this.input.nextLine());
        } catch(NumberFormatException e) {
            System.out.print("Invalid Input, Try Again: ");
            return getInt();
        }

    }

//    public int getInt(boolean promt) {
//        System.out.print("Enter an integer: ");
//        return getInt();
//    }
//
//    public int getInt(String promt) {
//        System.out.print(promt);
//        return getInt();
//    }

    public int getInt(int min, int max) {
        int n = getInt();
        return (n >= min && n <= max) ? n : getInt(min, max);
    }

    public int getInt(int min, int max, boolean prompt) {
        System.out.printf("Enter an Integer between %d and %d: ", min, max);
        return getInt(min, max);
    }

    public int getInt(int min, int max, String prompt) {
        System.out.printf(prompt, min, max);
        return getInt(min, max);
    }


    public double getDouble() {
        try {
            return Double.parseDouble(this.input.nextLine());
        } catch(NumberFormatException e) {
            System.out.print("Invalid input, try again: ");
            return getDouble();
        }
    }

//    public double getDouble(boolean prompt) {
//        System.out.print("Enter A Double: ");
//        return getDouble();
//    }

//    public double getDouble(String prompt) {
//        System.out.print(prompt);
//        return getDouble();
//    }

    public double getDouble(double min, double max) {
        double n = getDouble();
        return ( n >= min && n <= max ) ? n : getDouble(min, max);
    }

    public double getDouble(double min, double max, boolean prompt) {
        System.out.printf("Enter a Double between %f and %f: ", min, max);
        return getDouble();
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.printf(prompt, min, max);
        return getDouble();
    }


    public int getBinary() {
        try {
            System.out.print("Enter a binary number: ");
            return Integer.valueOf(this.input.nextLine(), 2);
        } catch (NumberFormatException e) {
            System.out.print("Invalid binary, try again: ");
            return getBinary();
        }
    }

    public int getHex() {
        try {
            System.out.print("Enter a hex number: ");
            return Integer.valueOf(this.input.nextLine(), 16);
        } catch (NumberFormatException e) {
            System.out.print("Invalid hex, try again: ");
            return getHex();
        }
    }



    public Input() {
        this.input = new Scanner(System.in);
    }
}

