import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("         Seja bem-vindo(a)!         ");
        System.out.println("-----------------------------------");

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o sobrenome do Cliente: ");
        String sobrenomeCliente = scanner.nextLine();

        System.out.println("Digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: (apenas números) ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        String nomeCompleto = nomeCliente.concat(" ").concat(sobrenomeCliente);

        System.out.println("Olá ".concat(nomeCompleto) + ", obrigado por criar uma conta em nosso banco. Sua agência é: " + agencia + ". O número da sua conta é: " + numeroConta + ". E seu saldo é: R$ " + saldo + ". Seu saldo já está disponível para saque!");

    }
}