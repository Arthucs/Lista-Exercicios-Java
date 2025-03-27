import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hora, min;

        System.out.println("Informe o numero segundos: ");
        double s = sc.nextInt();

        min = s/60;
        hora = s/3600;

        System.out.println(s + " segundos equivalem a " + min + " minutos e " + hora + " horas.");
    }
}
