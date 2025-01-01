import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner leituraDados = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        String numero = leituraDados.nextLine().replace(",",".");
        System.out.print("Segundo valor: ");
        String numero2 = leituraDados.nextLine().replace(",",".");
        leituraDados.close();

        // Converting the Strings to number (double)
        double valor = Double.parseDouble(numero);
        double valor2 = Double.parseDouble(numero2);

        // Arithmetic Operations
        double adicao = valor + valor2;
        double subt = valor - valor2;
        double multi = valor * valor2;
        double divisao = valor / valor2;

        System.out.printf("Soma = %.2f\n", adicao);
        System.out.printf("Subtração = %.2f\n", subt);
        System.out.printf("Multiplicação = %.2f\n", multi);
        System.out.printf("Divisão = %.2f\n", divisao);
    }
}
