package javaproject;

import java.util.Scanner;

public class Striiing {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }


        scanner.close();
    }


    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();

        str = str.replaceAll("[^a-z0-9]", "");

        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
