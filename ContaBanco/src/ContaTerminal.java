
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: IMPORTAR CLASSE SCANNER - done
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // importar Ramdom para gerar numeros aleatórios - done
        Random random = new Random();

        // EXIBIR MENSAGENS PARA O NOSSO USUÁRIO - done
        //OBTER PELO SCANNER OS VALORES DIGITADOS NO TERMINAL - done
        //EXIBIR A MENSAGEM CONTA CRIADA
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite sua Agência [ 123-1 ]: ");
        agencia = scanner.next();

        System.out.println("Quanto gostaria de depositar para abertura de conta? ");
        saldo = scanner.nextDouble();

        numeroConta = random.nextInt();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + ", e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
