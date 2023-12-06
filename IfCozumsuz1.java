package Java2;

import java.util.Scanner;

//Bir ürünün son satış fiyatı o ürünün fiyatı ile katma değer vergisinin toplamından
//oluşur. Bir ürünün katma değer vergisi ürünün tipine (bir tamsayı) göre
//değişir. Ürünün tipi 172 ise, katma değer vergisi %18; 188 ise, katma değer
//vergisi %8; 196 ise, katma değer vergisi %0’dır. Bir ürünün fiyatını ve tipini
//kullanıcıdan alan, ardından o ürünün son fiyatını hesaplayan ve ekranda
//gösteren programı yazınız. Program eğer ürünün tipi yanlışsa ekranda bir
//uyarı mesajı göstermelidir.
public class IfCozumsuz1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String tip;
        double cost;


        System.out.println("What is the code of the product?");
        tip = input.next();
        System.out.println("What is the cost of the product?");
        cost = input.nextDouble();

        if (tip.equals("172") ){
            cost = cost + (cost * 0.18);
            System.out.println(cost);
        }

        if (tip.equals("188")){
            cost += cost * 0.08;
            System.out.println(cost);
        }

        if (tip.equals("196")){
            System.out.println(cost);
        }
        else {
            System.out.println("Wrong product type!");
        }


    }


}
