import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f;
        double c;

        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        f = sc.nextDouble();

        c = (f -32)/1.8;

        System.out.println("Temperatura em celsius: " + c);
    }
}
