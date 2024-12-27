package desafios;
import java.util.Scanner;
import java.lang.Math;

public class Desafio08 {
    public static void main(String[] args) {
        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double valor = leituraDados.nextInt();

        leituraDados.close();

        double cubico = Math.pow(valor, 3);

        System.out.printf("%.1f elevado a 3 é igual a %.1f", valor, cubico);
    }
}
