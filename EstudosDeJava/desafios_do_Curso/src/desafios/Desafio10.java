package desafios;
import java.util.Scanner;
import java.lang.Math;

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

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        boolean possuiRaiz = delta > 0;
        String resultadoEquacao = possuiRaiz ? "Resultado:\n" + x1 + "\n" + x2:"Não possui Raiz Real";
        System.out.print(resultadoEquacao);
    }
}
