package Java2;

import java.util.Scanner;

//Kullanıcıdan 4 tam sayı alan ve bunların en küçüğü ile en büyüğünü ekranda
//gösteren programı yazınız.
public class IfCozumsuz4 {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 4 numbers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();
    int number4 = input.nextInt();
    int temp;

    if (number1 > number2) {
        temp = number1;
        number1 = number2;
        number2 = temp;
    }

    if (number2 > number3){
        temp = number2;
        number2 = number3;
        number3 = temp;
    }

    if (number3 > number4){
        temp = number3;
        number3 = number4;
        number4 = temp;
    }

    if (number1 > number2) {
        temp = number1;
        number1 = number2;
        number2 = temp;
    }

    if (number2 > number3){
        temp = number2;
        number2 = number3;
        number3 = temp;
    }

    if (number1 > number2) {
        temp = number1;
        number1 = number2;
        number2 = temp;
    }

    System.out.println("Smallest number is: " + number1);
    System.out.println("Largest number is: " + number4);
}
}
