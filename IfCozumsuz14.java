package Java2;

// Kullanıcıdan 1 ile 9 arasında bir sayı okuyan ve bu sayının Romen karşılığını
//(I, II, III, IV, V, VI, VII, IIX, IX,) ekranda gösteren programı yazınız.

import java.util.Scanner;

public class IfCozumsuz14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 9: ");
        int number = input.nextInt();

        switch (number){
            case 1 -> System.out.print("I");
            case 2 -> System.out.print("II");
            case 3 -> System.out.print("III");
            case 4 -> System.out.print("IV");
            case 5 -> System.out.print("V");
            case 6 -> System.out.print("VI");
            case 7 -> System.out.print("VII");
            case 8 -> System.out.print("VIII");
            case 9 -> System.out.print("IX");
        }

        }
    }

