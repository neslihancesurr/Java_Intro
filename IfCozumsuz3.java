package Java2;

import java.util.Scanner;

//Kullanıcıdan 3 tam sayı alan ve bunları küçükten büyüğe doğru sıralı biçimde
//ekranda gösteren programı yazınız.
public class IfCozumsuz3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int temp;

        if (number1 > number2){
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 > number3){
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number1 > number2){
            temp = number1;
            number1 = number2;
            number2 = temp;

        }
        System.out.println(number1 + " " + number2 + " " + number3);



    }


}
