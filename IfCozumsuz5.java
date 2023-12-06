package Java2;

import java.util.Scanner;

//Kullanıcıdan 0 ile 999 arasında bir sayı okuyan ve bu sayının tüm basamaklarını
//ekranda gösteren programı yazınız. Yazdığınız program ayrıca okunan
//sayının kaç basamaklı olduğunu da ekranda göstermelidir.
public class IfCozumsuz5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter an number between 0 and 1000: ");
        number = input.nextInt();

        if (number == 0 || number == 1000){
            System.out.println("The number cannot be 0 or 1000.");
        } else if (number < 10){
            System.out.println("The number has 1 digit.");
            System.out.println("The only digit is " + number);
        } else if (number < 100){
            int birler = number % 10;
            int onlar = number / 10;
            System.out.println("The number has 2 digits.");
            System.out.println("The digits of the number are " + birler + " and " + onlar);

        } else if (number < 1000){
            int birler = number % 10;
            int onlar = (number / 10) % 10;
            int yuzler = number / 100;

            System.out.println("The number has three digits.");
            System.out.println("The digits of the number are " + birler + ", " + onlar + " and " + yuzler);



        }





    }
}
