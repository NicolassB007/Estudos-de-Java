package fundamentos;
// Learning about Variable and Constants

public class Variaveis_e_Constantes {
	public static void main(String[] args) {
		double raio = 3;
		final double VALOR_PI = 3.14159;
		double area = VALOR_PI * (raio * raio);
		
		System.out.println(area);
		
		// Assigning a new value for variable 'raio';
		raio = 8;
		area = VALOR_PI * (raio * raio);
		
		System.out.println("Área = " + area + "m2");
	}
}
