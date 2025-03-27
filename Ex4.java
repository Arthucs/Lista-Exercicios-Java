import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c, j, m;
        int n;

        System.out.println("Insira, respectivamente, o valor do capital a ser aplicado, o prazo de aplicação em meses e a taxa de juros mensal: ");
        c = sc.nextDouble();
        n = sc.nextInt();
        j = sc.nextDouble() / 100;

        m = c * Math.pow((1 + j), n);

        System.out.println("Montante a ser recebido: " + m);
    }
}
