package fundamentos;

public class TiposStrings {
	public static void main(String[] args) {
		System.out.println("Olá pessoal!".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equals("Boa Tarde"));
		System.out.println(s.equalsIgnoreCase("Boa Tarde"));
		
		var nome = "Nicolas";
		var sobreNome = "Bissotto";
		var idade = 17;
		var salario = 119999.12;
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobreNome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		System.out.printf("Nome: %s %s\n", nome, sobreNome);
		System.out.printf("Idade: %d\n", idade);
		System.out.printf("Salario: %.2f", salario);
		
		System.out.println("\n\n");
		
		System.out.println("Uma frase".contains("Fras"));
		System.out.println("Uma frase".indexOf("ma"));
		System.out.println("Uma frase".substring(3));
		System.out.println("Uma frase".substring(3, 6));
	}
}
