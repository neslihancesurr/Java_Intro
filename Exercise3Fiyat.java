package Java;

import java.util.Scanner;

//Bir ürünün son satış fiyatı, o ürünün satış fiyatı ile vergisinin toplamına
//eşittir. Ürünün vergisinin %18 olduğunu varsayarak, ürünün satış fiyatını
//kullanıcıdan alan ve son satış fiyatını ekranda gösteren programı yazınız.

public class Exercise3Fiyat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double satis, vergilifiyat;
        System.out.println("Ürünün vergisiz satış fiyatı nedir?");
        satis = input.nextDouble();
        vergilifiyat = satis + satis * 0.18 ;
        System.out.println("Ürünü vergi dahil fiyatı" + " " + vergilifiyat + " " + "TL'dir.");
    }

}
