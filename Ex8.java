import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moto, carro, totalRodas, totalV;

        System.out.println("Informe, respectivamente, o total de veiculos e o total de rodas:");
        totalV = sc.nextInt();
        totalRodas = sc.nextInt();

        carro = ((totalV * -2) + totalRodas) / 2;
        moto = totalV - carro;
        
        System.out.println("Total de Carros: " + carro + "\nTotal de Motos: " + moto);
    }
}
