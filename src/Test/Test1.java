package Test;

import java.util.Scanner;

public class Test1 {
    static String user;
    private static String[] split;

    public static void main(String[] args) {
        System.out.println("Please input a selection：");
        Scanner input = new Scanner(System.in);
        boolean a = true;
        int choices = input.nextInt();
        switch (choices) {
        case 1:
            String name = "";
            user();
            break;
        case 2:
            num();
            int number = 0;
            break;
        case 3:
            System.out.println("No more options.");
            a = false;
        }
    }

    public static void user() {
        System.out.print("Please type your name：");
        var enter = new Scanner(System.in);
        String name = enter.nextLine();
        String first = name.substring(0, 1);
        split = name.split(" ");
        String strs[] = split;
        name = first + strs[strs.length - 1];
        System.out.println("Name:" + name);
    }

    public static void num() {
        System.out.println("Please enter the number you want to calculate：");
        {
            Scanner input = new Scanner(System.in);
            double number = input.nextDouble();
            int number1 = 1;
            if (number <= 0) {
                System.out.println("Error ");
            } else if (number % 1 != 0) {
                System.out.println("Error");
            } else {
                System.out.print("The factorial of the number is:");
                for (int b = 1; b <= number; b++) {
                    System.out.print(b + "*");
                    number1 = number1 * b;
                }
                System.out.print("=" + number1);
            }
        }
    }
}
