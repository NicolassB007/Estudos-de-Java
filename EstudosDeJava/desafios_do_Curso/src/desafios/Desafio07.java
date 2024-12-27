package desafios;
import java.util.Scanner;
import java.lang.Math;

public class Desafio07 {
    public static void main(String[] args) {
        System.out.println("Calculo IMC");

        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Peso: ");
        String peso = leituraDados.nextLine().replace(",", ".");
        System.out.print("Altura: ");
        String altura = leituraDados.nextLine().replace(",", ".");

        leituraDados.close();

        double pesoDouble = Double.parseDouble(peso);
        double alturaDouble = Double.parseDouble(altura);

        double calculoImc = pesoDouble / (Math.pow(alturaDouble, 2));

        System.out.printf("Seu Imc é %.2f\n", calculoImc);

        String imcNormal = calculoImc >= 18.5 && calculoImc <= 24.9 ? "Seu Imc é Normal": "";
        
        String imcSobrePeso = calculoImc >= 25.0 && calculoImc <= 29.9 ? "Seu Imc é Normal" : "";

        String imcObesidade = calculoImc >= 30.0 && calculoImc <= 39.9 ? "Seu Imc está em OBESIDADE" : "";

        String imcObesidadeMorbida = calculoImc > 40 ? "OBESIDADE MORBIDA" : "";
         
        System.out.print(imcNormal);
        System.out.print(imcSobrePeso);
        System.out.print(imcObesidade);
        System.out.print(imcObesidadeMorbida);
    }
}
