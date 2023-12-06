package Java2;

import java.util.Locale;
import java.util.Scanner;

//Kullanıcıdan haftanın kaçıncı günü olduğun okuyan (Pazartesi 1, Salı 2, vs.)
//ve ekranda bu günün Türkçe karşılığını gösteren programı yazınız.
public class IfCozumsuz16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which day of the week is it? (1-7)");
        input.useLocale(new Locale("tr", "TR"));

        int day = input.nextInt();

        switch (day) {
            case 1 -> System.out.println("Pazartesi");
            case 2 -> System.out.println("Salı");
            case 3 -> System.out.println("Çarşamba");
            case 4 -> System.out.println("Perşembe");
            case 5 -> System.out.println("Cuma");
            case 6 -> System.out.println("Cumartesi");
            case 7 -> System.out.println("Pazar");
        }
    }
}