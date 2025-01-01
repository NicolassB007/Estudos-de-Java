import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner leituraDados = new Scanner(System.in);
        System.out.print("Primeiro valor: ");
        String numero = leituraDados.nextLine().replace(",", ".");

        System.out.print("Segundo valor: ");
        String numero2 = leituraDados.nextLine().replace(",", ".");

        System.out.print("Terceiro valor: ");
        String numero3 = leituraDados.nextLine().replace(",", ".");
        leituraDados.close();

        // Converting every Strings to number (double)
        double valorDouble = Double.parseDouble(numero);
        double valorDouble2 = Double.parseDouble(numero2);
        double valorDoubl3 = Double.parseDouble(numero3);

        // Realizing calculus
        double soma = valorDouble + valorDouble2;
        double soma_vezes_terceiro_valor = soma * valorDoubl3;

        // Printing results
        System.out.printf("O resultado da soma é %.2f\n", soma);
        System.out.printf("O resultado da soma vezes o terceiro valor é %.2f", soma_vezes_terceiro_valor);
    }
}
