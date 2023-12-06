package Java2;
//Kullanıcıdan yılın kaçıncı ayı olduğunu okuyan (Ocak 1, Şubat 2, vs.) ve
//ekranda bu ayın Türkçe karşılığını gösteren programı yazınız.
import java.util.Scanner;

public class IfCozumsuz18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the month as a number:");
        int month = input.nextInt();

        switch (month){
            case 1 -> System.out.println("Ocak");
            case 2 -> System.out.println("Şubat");
            case 3 -> System.out.println("Mart");
            case 4 -> System.out.println("Nisan");
            case 5 -> System.out.println("Mayıs");
            case 6 -> System.out.println("Haziran");
            case 7 -> System.out.println("Temmuz");
            case 8 -> System.out.println("Ağustos");
            case 9 -> System.out.println("Eylül");
            case 10 -> System.out.println("Ekim");
            case 11 -> System.out.println("Kasım");
            case 12 -> System.out.println("Aralık");
            default -> System.out.println("Yanlış sayı!");

        }

    }
}