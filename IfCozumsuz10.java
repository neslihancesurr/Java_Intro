package Java2;

import java.util.Scanner;

//Kullanıcıdan 4 öğrencinin ders notlarını okuyan ve bu öğrencilerden hangilerinin
//dersi geçtiğini ekranda gösteren programı yazınız. Bir öğrencinin
//aldığı not, eğer dersin ortalamasından yüksekse/düşükse, öğrenci dersten
//geçer/kalır.

public class IfCozumsuz10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("First student: ");
        double student1 = input.nextDouble();

        System.out.println("Second student: ");
        double student2 = input.nextDouble();

        System.out.println("Third student: ");
        double student3 = input.nextDouble();

        System.out.println("Fourth student: ");
        double student4 = input.nextDouble();

        double mean;
        mean = (student1 + student2 + student3 + student4) / 4;

        if (student1 > mean){
            System.out.println("Student 1 Passed");
        } else {
            System.out.println("Student 1 Failed");
        }

        if (student2 > mean){
            System.out.println("Student 2 Passed");
        } else {
            System.out.println("Student 2 Failed");
        }

        if (student3 > mean){
            System.out.println("Student 3 Passed");
        } else {
            System.out.println("Student 3 Failed");
        }

        if (student4 > mean){
            System.out.println("Student 4 Passed");
        } else {
            System.out.println("Student 4 Failed");
        }




    }
}
