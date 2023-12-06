package Java2;
//Kullanıcıdan iki işlenen ve bir işlemci (+, -, x, /, %) okuyan ve ekranda bu
//işlemin sonucunu gösteren programı yazınız.
import java.util.Scanner;

public class IfCozumsuz20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 0;

        System.out.println("Enter an number: ");
        int number1 = input.nextInt();
        System.out.println("Enter a number: ");
        int number2 = input.nextInt();
        System.out.println("Enter an operator: ");
        String operator = input.next();

        switch (operator) {
            case "+" -> result = number2 + number1;
            case "-" -> result = number1 - number2;
            case "x" -> result = number1 * number2;
            case "/" -> result = number1 / number2;
            case "%" -> result = number1 % number2;
            default -> System.out.println("Wrong operator type!");
        }

        System.out.println(result);



    }
}
