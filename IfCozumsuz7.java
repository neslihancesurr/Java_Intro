package Java2;

import java.util.Scanner;

public class IfCozumsuz7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much money do you have?");
        double money = input.nextDouble();

        System.out.println("What is your bank code?");
        int code = input.nextInt();

        while (code != 99 && code != 98 && code != 97 && code != 96) {
            System.out.println("Wrong bank code! Enter a new code:");
            code = input.nextInt();
        }

        switch (code) {
            case 99 -> {
                money += money * 0.09;
                System.out.println("Money after taxes: " + money);
            }
            case 98 -> {
                money += money * 0.10;
                System.out.println("Money after taxes: " + money);
            }
            case 97 -> {
                money += money * 0.08;
                System.out.println("Money after taxes: " + money);
            }
            case 96 -> {
                money += money * 0.11;
                System.out.println("Money after taxes: " + money);
            }
        }
    }

}