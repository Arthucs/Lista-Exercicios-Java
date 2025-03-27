import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nHoras, valorHora, salFamilia, nFilhos, salBruto;

        System.out.println("Por favor, informe respectivamente: \n- Numero de horas trabalhadas no mes \n- Valor recebido por hora de trabalho \n- Valor do salario-familia \n- Numero de filhos com menos de 14 anos");
        nHoras = sc.nextDouble();
        valorHora = sc.nextDouble();
        salFamilia = sc.nextDouble();
        nFilhos = sc.nextDouble();

        salBruto = (nHoras * valorHora) + (nFilhos * salFamilia);

        System.out.println("Salário Bruto: " + salBruto);
    }
}
