package Java2;

import java.util.Scanner;

//Kullanıcıdan bir tamsayı okuyan ve bu sayının 5 ile 6’dan hangisi/hangileri
//ile bölündüğünü ekranda gösteren programı yazınız.
public class IfCozumsuz12 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number;
        System.out.println("Enter a number: ");
        number = input.nextInt();

        if (number % 5 != 0 && number % 6 != 0){
            System.out.println(number + " is not divisable by 5 or 6");
        } else if (number % 5 == 0 && number % 6 == 0){
            System.out.println(number + " is divisable by both 5 and 6");
        } else if (number % 5 == 0){
            System.out.println("The number is divisable by 5");
        } else if (number % 6 == 0){
            System.out.println("The number is divisable by 6");
        }

}
}
