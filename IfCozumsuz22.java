package Java2;

import java.util.Scanner;

//Kullanıcıdan önce öğrenci sayısını ardından da bu kadar öğrencinin notlarını
//okuyan ve bu öğrencilerin ortalamasını ekranda gösteren programı yazınız.

public class IfCozumsuz22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of students: ");
        int student = input.nextInt();
        System.out.println();

        int i = 1;
        int sum=0;
        int grade=0;

        while (i <= student){
            System.out.println("Grade " + i + ": ");
            grade = input.nextInt();
            sum += grade;
            i++;
        }

        System.out.println("The mean of the grades: " + sum / student);
    }
}