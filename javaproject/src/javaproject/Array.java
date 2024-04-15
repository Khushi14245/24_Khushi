package javaproject;


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
     
        int[][] array = {{1, 2, 3, 4}, {1, 2}, {1, 2, 3, 4, 5}};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data for the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Data stored in the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
