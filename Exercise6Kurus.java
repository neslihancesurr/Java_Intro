package Java;
import java.util.Scanner;
//Kullanıcıdan elindeki 1 kuruş, 5 kuruş, 10 kuruş, 25 kuruş ve 50 kuruşluk
//bozukluklarının sayısını isteyen ve kullanıcının elinde kaç para olduğunu
//ekranda gösteren programı yazınız.

public class Exercise6Kurus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int kurus1, kurus5, kurus10, kurus25, kurus50, toplam;
        double toplamlira;

        System.out.println("1 kuruşların sayısı:");
        kurus1 = input.nextInt();
        System.out.println("5 kuruşların sayısı:");
        kurus5 = input.nextInt();
        System.out.println("10 kuruşların sayısı:");
        kurus10 = input.nextInt();
        System.out.println("25 kuruşların sayısı:");
        kurus25 = input.nextInt();
        System.out.println("50 kuruşların sayısı:");
        kurus50 = input.nextInt();

        toplam = kurus1 + kurus5*5 + kurus10*10 + kurus25*25 + kurus50*50;
        toplamlira = (double) toplam / 100;

        System.out.println(toplamlira + " " + "TL'niz var.");


    }
}

