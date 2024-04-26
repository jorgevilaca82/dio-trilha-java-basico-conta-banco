import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    final static String mensagemFinalFormat = "Olá %s, " +
            "obrigado por criar uma conta em nosso banco, sua agência é %s, " +
            "conta %s e seu saldo %s já está disponível para saque";

    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Por favor, informe seu nome completo!");
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.next();

            System.out.println("Por favor, digite o número da Conta!");
            numero = scanner.nextInt();

            System.out.println("Por favor, digite o saldo da sua Conta!");
            saldo = scanner.nextFloat();

            String mensagemFinal = String.format(mensagemFinalFormat, nomeCliente, agencia, numero, saldo);
            System.out.println(mensagemFinal);

        } catch (Exception e) {
            System.out.println("Algo errado aconteceu");
            throw e;
        }
    }
}
