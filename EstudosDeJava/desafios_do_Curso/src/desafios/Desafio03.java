package desafios;
// Arithmetic challenge

public class Desafio03 {
	public static void main(String[] args) {
		int contaParte1 = (int) Math.pow((6 * (3 + 2)), 2);
		int contaParte2 = 3 * 2;
		double contaFinal = contaParte1 / contaParte2;
		System.out.printf("Primeira conta -> [6 * (3 + 2)] ^ 2 é igula a %.2f\n",
				contaFinal);
		
		int conta2Parte1 = (1 - 5) * (2 - 7);
		int conta2Parte2 = 2;
		double conta2Final = Math.pow((conta2Parte1 / conta2Parte2), 2);
		System.out.printf("Segunda conta -> ((1 - 5) * (2 - 7) / 2) ^ 2 é igual a %.2f\n",
				conta2Final);
		
		int conta3Parte1 = (int) Math.pow((contaFinal - conta2Final), 3);
		int resultadoFinal = conta3Parte1 / 1000;
		System.out.printf("O resultado FINAL é de %d", resultadoFinal);
	}
}
