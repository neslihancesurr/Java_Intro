package Java;
import java.util.Scanner;
//Kullanıcıdan Celcius olarak hava sıcaklığını alan ve Fahrenheit olarak hava
//sıcaklığını ekranda gösteren programı yazınız. 33.8

public class Exercise7Fahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int celcius, fahrenheit;

        System.out.println("Sıcaklığı Celcius cinsinden belirtiniz.");
        celcius = input.nextInt();
        fahrenheit = celcius * 9/5 + 32;
        System.out.println("Bu sıcaklığın değeri:" + " " + fahrenheit + " " + "Fahrenheit");

    }
}
