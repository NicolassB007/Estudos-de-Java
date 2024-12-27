package desafios;
import java.util.Scanner;	

public class Desafio05 { 
	public static void main(String[] args) {
		System.out.println("Conversor de Fahrenheit para Celsius");
		Scanner leituraDados = new Scanner(System.in);

		System.out.print("Informe a temperatura em Fahreheit: ");
		double tempFahrenheit = leituraDados.nextDouble();

		double conversorCelsius = (double) 5 / 9 * (tempFahrenheit - 32);

		System.out.printf("%.2f Fahrenheit é igual a %.2f Celsius", tempFahrenheit, conversorCelsius);

		leituraDados.close();
	}
}
