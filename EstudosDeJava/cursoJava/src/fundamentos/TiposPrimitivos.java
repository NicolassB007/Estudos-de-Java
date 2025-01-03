package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Staff Information
		
		// Whole numeric type
		// Byte, Short, int and long;
		
		byte anosdeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_131_134_716L;
		
		// Real numeric type
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Booleano type;
		boolean estaDeFerias = false; 
		
		// Caractere type;
		char status = 'A';
		
		// Days in enterprise
		System.out.println(anosdeEmpresa * 365);
		
		// Travels quantity
		System.out.println(numeroDeVoos / 2);
		
		// Points to real - Conversion;
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": Ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
