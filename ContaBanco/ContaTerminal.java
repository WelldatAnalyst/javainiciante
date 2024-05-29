import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para leitura dos dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura do número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Limpando o buffer do Scanner
        scanner.nextLine();

        // Solicitação e leitura da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitação e leitura do nome do cliente
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        // Solicitação e leitura do saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);

        // Fechamento do scanner
        scanner.close();
    }
}
