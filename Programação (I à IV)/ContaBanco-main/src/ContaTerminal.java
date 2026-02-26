import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua agencia: ");
        int agencia = scanner.nextInt();

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$%s já está disponivel para saque.", nome, agencia, numero, saldo);
    }
}