import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá! Seja bem vindo ao Banco dos Coins, para prosseguirmos na criação da sua conta, precisamos de alguns dados primeiro...");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número que você deseja para sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número que você deseja para a sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o valor que você pretende trazer para nosso banco: ");
        double saldo = scanner.nextDouble();

        System.out.println("===============================================");
        System.out.println("Sua conta está sendo criada, aguarde alguns instantes...");
        Thread.sleep(5000);
        System.out.println("===============================================");
        System.out.println("PARABÉNS! A sua conta foi criada com sucesso! Desejamos as boas vindas ao Banco dos Coins!");
        System.err.println("INFORMAÇÕES DA CONTA:\nNome: " + nome + "\nNúmero da conta: " + numeroConta + "\nAgência: " + agencia + "\nSaldo: " + saldo);
    }
}
