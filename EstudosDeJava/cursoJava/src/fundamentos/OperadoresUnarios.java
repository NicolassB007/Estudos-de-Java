package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
//		a++; // a = a + 1;
//		b--; // b = b - 1;
//		
//		++a; 
//		--b; 
		
		System.out.println("Mini Desafio");
		System.out.println(++a == b--); 
		/* 
			a receive + 1 before of comparison 
			and b receive - 1 after comparison
		*/
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
