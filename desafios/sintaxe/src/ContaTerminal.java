
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== BEM-VINDO AO CONTABANCO ===");

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá "
                .concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.format(Locale.US, "%.2f", saldo))
                .concat(" já está disponível para saque.");

        System.out.println();
        System.out.println(mensagem);

        scanner.close();
    }
}
