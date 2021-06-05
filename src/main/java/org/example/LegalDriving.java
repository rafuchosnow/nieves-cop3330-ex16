package org.example;

import java.util.Scanner;

public class LegalDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");
        String ageString = input.nextLine();
        int ageNumber = Integer.parseInt(ageString);

        int legalAge = 16;

        String outputString = (ageNumber >= legalAge) ?
                "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(outputString);
    }
}
