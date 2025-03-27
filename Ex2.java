import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        double nAcresimo;

        System.out.println("Informe o valor do produto: ");
        n = sc.nextDouble();

        nAcresimo = ((n*10)/100) + n;

        System.out.println("Novo valor: " + nAcresimo);
    }
}
