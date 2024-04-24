import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome completo do cliente?");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor, digite o numero da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o numero da agencia:");
        String agencia = scanner.next();

        System.out.println("Qual o saldo do cliente?");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCompleto, agencia, numero, saldo);

        scanner.close();
    }
}
