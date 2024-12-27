package desafios;
import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {
        System.out.println("Conversor de Celsius para Fahrenheit");

        Scanner leituraDados = new Scanner(System.in);

        System.out.print("Qual a temperatura em Celsius: ");
        double tempCelsius = leituraDados.nextDouble();

        leituraDados.close();

        double conversorFahrenheit = tempCelsius * 1.8 + 32;

        System.out.printf("%.2f Celsius é igual a %.2f Fahrenheit", tempCelsius, conversorFahrenheit);
    }
}
