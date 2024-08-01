import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite o numero da conta(4 dígitos): ");
        numero = input.nextInt();

        System.out.println("Por favor digite a agencia(XXX-X)");
        agencia = input.next();

        System.out.println("Por favor digite o nome do cliente: ");
        nomeCliente = input.next();

        System.out.println("Por favor digite o saldo: ");
        saldo = input.nextDouble();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo %.2f já está disponível para saque", saldo);
    }
}
