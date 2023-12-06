package Java2;

import java.util.Scanner;

//Kullanıcıdan 0 ile 100 arasında bir sayı okuyup bu sayı asalsa ekrana “Asal”,
//değilse “Asal değil” yazan programı yazınız.
//Sadece kendine ve ikiye bölünebilecek.

public class IfCozumsuz9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 100: ");
        int number = input.nextInt();

        while (number < 0 || number > 100){
            System.out.println("Invalid number! Enter a new number: ");
            number = input.nextInt();
        }

        if (number == 1) {
            System.out.println(number + " is not a prime number.");
        } else if (number == 2 || number == 3 || number == 5 || number == 7) {
            System.out.println(number + " is a prime number.");
        } else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
            System.out.println(number + " is not a prime number.");
        } else {
            System.out.println(number + " is a prime number.");
        }
    }
}
