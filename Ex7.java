import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salFixo, vendasTotal, vendasPercent, salTotal;

        System.out.println("Informe, respectivamente: \n- O valor do salario fixo \n- O valor total das vendas no mes \n- O percentual recebido sobre as vendas mensais");
        salFixo = sc.nextDouble();
        vendasTotal = sc.nextDouble();
        vendasPercent = sc.nextDouble();

        salTotal = salFixo + (vendasTotal*vendasPercent)/100;

        System.out.println("Salario Total: " + salTotal);
    }
}
