package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
//		String s = "Texto para teste";
		String s = new String("Outro texto para teste");
		s.toUpperCase();
		
		// Wrappers are the object version of primitive types
		int a = 123;
		System.out.printf("%d", a);
	}
}
