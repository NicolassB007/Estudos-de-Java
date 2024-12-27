package desafios;
import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] args) {
        System.out.println("Calculo da área de um triângulo");

        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Base: ");
        double base = leituraDados.nextDouble();
        System.out.print("Altura: ");
        double altura = leituraDados.nextDouble();

        leituraDados.close();

        double areaTriangulo = base * altura / 2;

        System.out.printf("Área -> %.2f", areaTriangulo);
    }
}
