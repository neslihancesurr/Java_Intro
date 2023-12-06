package Java2;

import java.util.Scanner;

//Yazacağınız programda bir sayıyı okuyacak ve bu sayının farklı koşullardan
//hangilerini sağladığını kontrol edeceksiniz. Sayı 9’a bölünen bir negatif
//tamsayı ise, ekrana X yazacaksınız. Sayı pozitif ve 7’nin katı ise ekranda
//Y yazacaksınız. Sayı tek ise ekranda Z yazacaksınız. Ekranda Y yazılmışsa,
//Z yazılmayacaktır. Yukarıdaki kurallardan hiçbiri sağlanmıyorsa, ekrana W
//yazılacaktır.

public class IfCozumsuz8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number < 0 && number % 9 == 0){
            System.out.println("X");
        } else if (number > 0 && number % 7 == 0) {
            System.out.println("Y");
        } else if (number % 2 != 0){
            System.out.println("Z");
        } else {
            System.out.println("W");
        }




    }
}
