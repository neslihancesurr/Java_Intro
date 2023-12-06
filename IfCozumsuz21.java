package Java2;

import java.util.Scanner;

//Kullanıcıdan dil ve 1-9 arasında bir sayı okuyan ve ardından bu sayının
//Türkçe veya İngilizce okunuşunu kullanıcının seçimine göre ekranda gösteren
//programı yazınız.

public class IfCozumsuz21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a language: ");
        String lang = input.next();
        System.out.println("Enter a number from 1 up to 9: ");
        int number = input.nextInt();

        if (lang.equals("English")){
            switch (number){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Wrong input for number!");

            }

        } else if (lang.equals("Turkish")){
            switch (number){
                case 1:
                    System.out.println("Bir");
                    break;
                case 2:
                    System.out.println("İki");
                    break;
                case 3:
                    System.out.println("Üç");
                    break;
                case 4:
                    System.out.println("Dört");
                    break;
                case 5:
                    System.out.println("Beş");
                    break;
                case 6:
                    System.out.println("Altı");
                    break;
                case 7:
                    System.out.println("Yedi");
                    break;
                case 8:
                    System.out.println("Sekiz");
                    break;
                case 9:
                    System.out.println("Dokuz");
                    break;
                default:
                    System.out.println("Wrong input for number!");

            }

        } else {
            System.out.println("Wrong input for language!");
        }

    }

}
