package fundamentos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		double a = 1; // Implicit conversion;
		System.out.println(a);
		
		float b = (float) 1.0; // Explicit conversion (CAST);
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Explicit conversion (CAST);
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}
}
