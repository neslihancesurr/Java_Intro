package Java2;

import java.util.Scanner;

//Bir ürünün son satış fiyatı o ürünün fiyatı ile katma değer vergisinin toplamından
//oluşur. Bir ürünün katma değer vergisi ürünün tipine (bir tamsayı) göre
//değişir. Ürünün tipi 172 ise, katma değer vergisi %18; 188 ise, katma değer
//vergisi %8; 196 ise, katma değer vergisi %0’dır. Bir ürünün fiyatını ve tipini
//kullanıcıdan alan, ardından o ürünün son fiyatını hesaplayan ve ekranda
//gösteren programı yazınız. Program eğer ürünün tipi yanlışsa ekranda bir
//uyarı mesajı göstermelidir.
//SWITCH İLE YAZ
public class IfCozumsuz2 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            double fiyat;
            double sonFiyat;
            String tip;

            System.out.println("Enter the product code: ");
            tip = input.next();
            System.out.println("Enter the product cost: ");
            fiyat = input.nextInt();

         switch (tip) {

             case "172":
                 fiyat += fiyat * 0.18;
                 System.out.println(fiyat);

                 break;

             case "188":
                 fiyat += fiyat * 0.08;
                 System.out.println(fiyat);

                 break;

             case "196":
                 System.out.println(fiyat);

             default:
                 System.out.println("Wrong code!");

         }
         }
        }


