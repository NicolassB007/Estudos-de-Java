import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        final double SALDO_INICIAL = 500.0;
        System.out.println("Saldo inicial - R$" + SALDO_INICIAL);

        Scanner leituraDados = new Scanner(System.in);
        System.out.print("Qual o valor do cheque: ");
        String cheque = leituraDados.nextLine().replace(",", ".");
        leituraDados.close();

        // Converting 'cheque' to double
        double cheque_convertido_double = Double.parseDouble(cheque);

        double novo_saldo = SALDO_INICIAL + cheque_convertido_double;

        System.out.printf("Novo saldo -> R$%.2f", novo_saldo);
    }
}
