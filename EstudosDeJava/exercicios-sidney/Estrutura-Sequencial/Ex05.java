import java.util.Scanner;
// In progress
public class Ex05 {
    public static void main(String[] args) {
        Scanner leituraDados = new Scanner(System.in);
        System.out.print("Saldo atual: R$");
        String valor = leituraDados.nextLine().replace(",", ".");
        System.out.print("Qual o valor de cada parcela: R$");
        String valor2 = leituraDados.nextLine().replace(",", ".");
        System.out.print("Quantas prestações serão: ");
        int qtd_prestacao = leituraDados.nextInt();
        System.out.print("Quantas prestações foram pagas: ");
        int qtd_prestacao_paga = leituraDados.nextInt();
        leituraDados.close();
    }
}
