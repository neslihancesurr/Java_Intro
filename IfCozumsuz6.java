package Java2;

import java.util.Scanner;

//Bir ülkede 4 banka bulunmaktadır. TIRT bankası, ZIRT bankası, FIRT
//bankası ve KIRT bankası. Her bankanın kendi kodu bulunmaktadır. Bu
//bankaların vermiş oldukları yıllık faizler sırasıyla: TIRT (99): %9, ZIRT
//(98): %10, FIRT (97): %8, KIRT (96): %11. Kullanıcıdan sahip olduğu para
//ile bu parayı yatıracağı bankanın kodunu alan ve bir ay sonra alacağı faizi
//hesaplayan programı yazınız.
public class IfCozumsuz6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How much money do you have?");
        double money = input.nextDouble();

        System.out.println("What is your bank code?");
        int code = input.nextInt();

        while (code != 99 && code != 98 && code != 97 && code != 96){
            System.out.println("Wrong bank code! Enter a new code:");
            code = input.nextInt();
        }

        if (code == 99) {
            money += money * 0.09;

        } else if (code == 98) {
            money += money * 0.10;

        } else if (code == 97) {
            money += money * 0.08;

        } else {
            money += money * 0.11;
        }

        System.out.println("Money after taxes: " + money);
        }
    }
