import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaA, mediaH, mediaG;

        System.out.println("Digite 3 numeros: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        mediaA = (n1 + n2 + n3)/3;
        mediaH = 3/((1/n1) + (1/n2) + (1/n3));
        mediaG = Math.cbrt((n1 * n2 * n3));

        System.out.println("Media Artitmetica: " + mediaA + "\nMedia Harmonica: " + mediaH + "\nMedia Geometrica: " + mediaG);
    }
}
