package Java2;

import java.util.Scanner;

//Kullanıcıdan 1 ile 99 arasında bir sayı okuyan ve bu sayının Romen karşılığını
//(I, II, . . ., XCIX) ekranda gösteren programı yazınız.
public class IfCozumsuz15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int birler;
        int onlar;

        System.out.println("Enter a number between 1 and 99: " );
        int number = input.nextInt();

        if (number > 99){
            System.out.println("Wrong number!");
        }

        if (number < 10){
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
                default -> System.out.println("Wrong number!");
            }

        }

        if (number >= 10) {
            birler = number % 10;
            onlar = number / 10;

            switch (onlar) {
                case 1 -> System.out.print("X");
                case 2 -> System.out.print("XX");
                case 3 -> System.out.print("XXX");
                case 4 -> System.out.print("XL");
                case 5 -> System.out.print("L");
                case 6 -> System.out.print("LX");
                case 7 -> System.out.print("LXX");
                case 8 -> System.out.print("LXXX");
                case 9 -> System.out.print("XC");
            }

            switch (birler){
                case 0 -> System.out.println("");
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
}
