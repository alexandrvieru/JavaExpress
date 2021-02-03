package edu.tekwill.scanner;

import org.omg.Messaging.SyncScopeHelper;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WorkingWithScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = sc.nextInt();

        System.out.println("User has entered: " + userInput);

    }
}
