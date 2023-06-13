import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = -1;
        String nome = "Dollynho seu Amiguinho";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        double valorSaque;

        System.out.println("""
                *********************************************
                Dados iniciais do cliente:
                
                Nome:              %s
                Tipo conta:        %s
                Saldo inicial:     %.2f
                *********************************************"""
                .formatted(nome, tipoConta, saldo));

        while (opcao != 4) {
            System.out.println("""
                    
                    Operações
                    
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a opção desejada:""");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("O saldo atual é R$ %.2f".formatted(saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    saldo += sc.nextDouble();
                    System.out.println("Saldo atualizado R$ %.2f".formatted(saldo));
                    break;
                case 3:
                    System.out.println("Informe o valor para transferir: ");
                    valorSaque = sc.nextDouble();
                    if (saldo < valorSaque) {
                        System.out.println("Não a saldo suficiente para fazer essa transferência.");
                        break;
                    }
                    saldo -= valorSaque;
                    System.out.println("Saldo atualizado R$ %.2f".formatted(saldo));
                    break;
                case 4:
                    opcao = 4;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}