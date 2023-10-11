package Java;

import java.util.Scanner;

public class Exercise1Kur {
    public static void main(String[] args){
        double dolar, result;
        final double euro = 0.8961;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Dolar cinsinden bir para değeri giriniz.");
        dolar = girdi.nextDouble();
        result = dolar * euro;
        System.out.println("Paranın euro cinsinden değeri" + " " + result + ".");

    }
}
