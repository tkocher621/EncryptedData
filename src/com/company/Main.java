package com.company;
import java.util.*;

public class Main {

    static List<Encryption> encryptedStrings = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    private static void PresentMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1 - Encrypt a word\n2 - Decrypt an existing word");
        //possibly check if number is an int here
        int a = Integer.parseInt(scan.nextLine());
        if (a == 1) {
            System.out.println("Enter a word to encrypt");
            String input = scan.nextLine();
            encryptedStrings.add(new Encryption(input));
        } else if (a == 2) {
            int iter = 1;

            System.out.println("Select a word to decrypt");
            for (Encryption enc : encryptedStrings) {
                System.out.println(iter + ": " + enc.encryptedInput);
            }
            int b = Integer.parseInt(scan.nextLine());
            if (b <= encryptedStrings.size()) {
                Encryption enc = encryptedStrings.get(b - 1);
                System.out.println("The decrypted value of " + enc.encryptedInput + " is: " + enc.originalInput);
            } else {
                System.out.println("Invalid number!");
            }
        }
        else
        {
            System.out.println("Invalid input");
        }
        PresentMenu();
    }

    public static void main(String[] args) {

        PresentMenu();

    }
}
