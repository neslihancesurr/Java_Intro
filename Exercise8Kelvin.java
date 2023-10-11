package Java;
import java.util.Scanner;
//Kullanıcıdan Fahrenheit olarak hava sıcaklığını alan ve Kelvin olarak hava
//sıcaklığını ekranda gösteren programı yazınız. T(K) = (T(°F) + 459.67)× 5/9
public class Exercise8Kelvin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double fahrenheit, kelvin;
        System.out.println("Sıcaklığı Fahrenheit cinsinden yazınız.");
        fahrenheit = input.nextInt();
        kelvin = (fahrenheit + 459.67) * ((double) 5 /9);
        System.out.println("Bu sıcaklığın değeri:" + " " + Math.round(kelvin) + " " + "Kelvin");
    }
}

