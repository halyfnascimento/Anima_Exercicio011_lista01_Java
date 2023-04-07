import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        int n1;
        int n2;
        double nr;
        double r1;
        double r2;
        double r3;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro numero ");
        n1 = teclado.nextInt();
        System.out.println();
        System.out.print("digite o segundo numero ");
        n2 = teclado.nextInt();
        System.out.println();
        System.out.print("digite o terceiro numero ");
        nr = teclado.nextDouble();
        teclado.close();

        // ação 2
        System.out.println();
        r1 = n1 * 2 * (n2 / 2);
        System.out.println();
        System.out.print("O produto do dobro do primeiro com a metade do segundo é " + r1);
        r2 = (n1 * 3) + 4;
        System.out.println();
        System.out.print("A soma do triplo do primeiro com o terceiro é " + r2);
        r3 = Math.pow(nr, 3);
        System.out.println();
        System.out.print("O terceiro elevado ao cubo é " + r3);
    }
}