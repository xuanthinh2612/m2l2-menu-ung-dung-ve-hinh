package com.company;

import java.util.Scanner;

public class menuUngDungVeHinh {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    String output = "";
                    for (int j = 5 - i; j >= 0; j--) {
                        output += "*";
                    }
                    System.out.println(output);
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;

            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("out of choice !!!");

        }
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        String output = "";
                        for (int j = 5 - i; j >= 0; j--) {
                            output += "*";
                        }
                        System.out.println(output);
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;

                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("out of choice !!!");

            }
        }


    }
}
