import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double logaritmo;

        System.out.println("Informe o logaritmando: ");
        double logaritmando = sc.nextDouble();

        System.out.println("Informe a base: ");
        double base = sc.nextDouble();

        logaritmo = Math.log(logaritmando) / Math.log(base);

        System.out.println("O logaritmo é: " + logaritmo);
    }
}
