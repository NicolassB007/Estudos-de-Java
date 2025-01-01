import java.util.Scanner;
import java.lang.Math;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leituraDados = new Scanner(System.in);
        System.out.print("Valor: ");
        String valor = leituraDados.nextLine().replace(",", ".");
        leituraDados.close();

        double valorDouble = Double.parseDouble(valor);
        double valor_cubico = Math.pow(valorDouble, 3);

        System.out.println("O valor " + valor + " ao cubo é " + valor_cubico);
    }
}
