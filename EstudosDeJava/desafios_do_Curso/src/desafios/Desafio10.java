package desafios;
import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {
        System.out.println("Calculo de equação do segundo grau");

        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Valor de a: ");
        double a = leituraDados.nextDouble();
        System.out.print("Valor de b: ");
        double b = leituraDados.nextDouble();
        System.out.print("Valor de c: ");
        double c = leituraDados.nextDouble();
        leituraDados.close();
    }
}
