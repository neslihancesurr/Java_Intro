package Java;

import java.util.Scanner;

// V koninin hacmi, r koninin tabanının yarıçapı
// ve h ise koninin yüksekliği olmak üzere
// V = 1/3πr2h formülü kullanılmaktadır.

public class Exercise2Koni {
    public static void main(String[] args){
        Scanner girdi = new Scanner(System.in);
        final double PI = 3.14;
        double hacim, yaricap, yukseklik;
        System.out.println("Bu program yarıçap ve yükseklik değerleri bilinen bir koninin hacmini hesaplamaktadır.");
        System.out.println("Koninin tabanının yarıçapını cm cinsinden giriniz.");
        yaricap = girdi.nextDouble();
        System.out.println("Koninin yüksekliğini cm cinsinden giriniz.");
        yukseklik = girdi.nextDouble();
        hacim = (((float)1/3))*PI*yaricap*yaricap*yukseklik;
        System.out.println("Koninin hacmi:" + hacim + " " + "santimetreküp");
    }
}
