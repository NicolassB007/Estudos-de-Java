package desafios;
// Converting Fahrenheit to Celsius;

public class Desafio01 {
	public static void main(String[] args) {
		double temp_Fahrenheit = 50;
		final int TEMP_FORMULA = 32;
		final double DIVISAO_FORMULA = 5.0 / 9.0;
		double resultado_Conversao = (temp_Fahrenheit - TEMP_FORMULA) * DIVISAO_FORMULA;
		
		System.out.println(temp_Fahrenheit + " Fahrenheit é igual a " + resultado_Conversao + " graus Celsius");
	}
}
