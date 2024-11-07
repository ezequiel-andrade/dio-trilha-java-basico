import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String nomeCliente = "Ezequiel";
        double saldo = 237.48;
        String agencia = "067-8";

        // Exibir mensagem para o usuario
        System.out.println("Por favor, digite o número da Conta?");
        // Obter pelo Scanner o dado digitado no trerminal
        int numeroConta = Integer.parseInt(scanner.next());

        // Exibir mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}
