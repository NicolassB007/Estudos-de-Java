package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer numero1 = 10000;
		System.out.println(numero1.toString().length());
		
		int numero2 = 1000000;
		System.out.println(Integer.toString(numero2).length());
		
		System.out.println(("" + numero2).length());
	}
}
