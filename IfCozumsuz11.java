package Java2;

import java.util.Scanner;

//Kullanıcıdan para üstü olarak verilecek miktarı okuyan ve bu para üstünü
//kaç tane (1 Kuruş, 5 Kuruş, 10 Kuruş, 25 Kuruş, 50 Kuruş) ile vereceğini
//ekranda gösteren programı yazınız.

public class IfCozumsuz11 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int money;
        int elli = 0;
        int yirmibes = 0;
        int on = 0;
        int bes = 0;
        int bir = 0;

        System.out.println("Money: ");
        money = input.nextInt();

        if (money >= 50) {
            elli = money / 50;
            money = money % 50;
        }
        if (money >= 25){
            yirmibes = money / 25;
            money = money % 25;
        }
        if (money >= 10){
            on = money / 10;
            money = money % 10;
        }
        if (money >= 5) {
            bes = money / 5;
            money = money % 5;
        }
        if (money >= 1) {
            bir = money;
        }
        System.out.println(elli);
        System.out.println(yirmibes);
        System.out.println(on);
        System.out.println(bes);
        System.out.println(bir);


    }
}
