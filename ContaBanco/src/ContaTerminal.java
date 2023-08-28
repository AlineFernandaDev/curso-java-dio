import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Olá, seja bem vindo ao DIO Bank, por favor digite sua Agência:");
            String agencia = scan.next();
        
        System.out.println("Agora digite a sua Conta:");
            int conta = scan.nextInt();
                scan.nextLine();

        System.out.println("Confirme por gentileza o seu Nome Completo:");
            String nomeCompleto = scan.nextLine();

        System.out.println("Confirme também o seu saldo:");
            double saldo =  scan.nextDouble();

        System.out.println("Olá," + nomeCompleto + ". Obrigado por criar uma conta no nosso banco, sua Agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque." );

        scan.close();
    }
}
