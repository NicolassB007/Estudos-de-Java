package desafios;
// Logic operator challenge

public class Desafio04 {
	public static void main(String[] args) {
		boolean trabalho1 = true;	
		boolean trabalho2 = true;
		
		boolean tv50Polegadas = trabalho1 && trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean tv32Polegadas = trabalho1 ^ trabalho2;
		System.out.println("Voce comprou a Tv de 50 polegadas? " + tv50Polegadas);
		System.out.println("Você foi comprar uma Tv de 32 polegadas? " + tv32Polegadas);
		System.out.println("Você foi tomar sorvete? " + sorvete);
	}
}
