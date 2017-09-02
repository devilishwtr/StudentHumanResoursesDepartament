package ru.osipov.shrd;

import java.util.Scanner;

public class Main{
    static Scanner in = new Scanner (System.in);
    static int welcomeAge = in.nextInt ();
    static String welcomeChoise = in.next ();

    public static void main(String[] args) {
        hello(welcomeAge,welcomeChoise);
    }

    public static void hello (int num, String choise){
        welcomeAnswer ();
        if (num>18 && choise.equals ("yes")) {
            System.out.println ("Hello. Welcome to adult world.");
        }
    }

    private static void welcomeAnswer () {
        System.out.println ("Before you come to us, we need to ask if you are 18 years old and are you sure of this?\n" +
                "Enter your age and write in a space word yes");
    }
}
