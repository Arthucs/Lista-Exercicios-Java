import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma =0;
        double media;

        System.out.println("Informe 2 numeros: ");
        for (int i = 1; i<=2; i++) {
            soma += sc.nextDouble();
        }
        media = soma/2;

        System.out.println("A média aritmetica dos dois numeros e: " + media);
    }
}
