package Java;
import java.util.Scanner;

// 0 ile 1000 arasında bir tamsayıyı okuyan ve bu tamsayının rakamları toplamını
//ekranda gösteren programı yazınız. Örneğin okunan sayı 932 ise, rakamlar
//toplamı 9 + 3 + 2= 14’tür.

public class Exercise5Rakam {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi, birler, onlar, yuzler, toplam;
        System.out.println("Üç basamaklı bir tam sayı giriniz.");
        sayi  = input.nextShort();
        yuzler = sayi / 100;
        onlar = (sayi / 10) % 10;
        birler = sayi % 10;
 toplam = yuzler + onlar + birler;
        System.out.println("Sayının rakamları toplamı:" + " " + toplam);

    }
}
