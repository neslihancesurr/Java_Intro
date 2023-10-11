package Java;

//Bir ürünün son satış fiyatı, o ürünün satış fiyatı ile vergisinin toplamına
//eşittir. Ürünün vergisinin %18 olduğunu varsayarak, ürünün son satış fiyatını
//kullanıcıdan alan ve satış fiyatını ekranda gösteren programı yazınız.

import java.util.Scanner;
public class Exercise4Fiyat2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double vergili, vergisiz;
        System.out.println("Ürünün satış fiyatını yazınız.");
        vergili = input.nextDouble();
        vergisiz = vergili / 1.18;
        System.out.println("Ürünün vergisiz satış fiyatı" + " " + vergisiz + " " + "TL'dir.");
    }
}
