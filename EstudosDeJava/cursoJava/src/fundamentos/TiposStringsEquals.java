package fundamentos;

import java.util.Scanner;

public class TiposStringsEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		
		System.out.println("2".equals(s1));
		
		Scanner leituraDados = new Scanner(System.in);
		
		String s2 = leituraDados.nextLine();
		
		System.out.println(s2);
		System.out.println("2".equals(s2.trim()));
		
		leituraDados.close();
	}
}
