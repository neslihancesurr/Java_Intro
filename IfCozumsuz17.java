package Java2;

import java.util.Scanner;

//Kullanıcıdan haftanın kaçıncı günü olduğun okuyan (Pazartesi 1, Salı 2, vs.)
//ve ekranda bu günün İngilizce karşılığını gösteren programı yazınız.
public class IfCozumsuz17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Which day of the week is it? (1-7)");
        int day = input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}
