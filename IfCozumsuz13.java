package Java2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//Kullanıcıdan bir silindirin taban yarıçapı ile yüksekliğini okuyan ve bu
//silindirin hacmini ekranda gösteren programı yazınız. Kullanıcı eğer yarıçapı
//veya yüksekliği yanlış girerse, program ekranda bir mesaj gösterecektir. Pi*r^2*h

public class IfCozumsuz13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double volume;

        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();

        if (radius < 0){
            System.out.println("The radius can't be a negative number.");
            System.exit(0);
        }

        System.out.println("Enter the height: ");
        double height = input.nextDouble();

        if (height < 0){
            System.out.println("The height can't be a negative number.");
            System.exit(0);
        }

        volume = Math.ceil(Math.PI * (radius * radius) * height);
        System.out.println("The volume is: " + volume);




    }
}
