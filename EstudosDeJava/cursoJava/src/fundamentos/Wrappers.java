package fundamentos;

//import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 100000;
		Long l = 10000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i);
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c);
		
		//entrada.close();
	}
}
