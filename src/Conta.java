import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Patrick Rebecchi ";
        double saldoInicial = 2500.00;
        String tipoDeConta = "Corrente";

        System.out.println("****************************************");
        System.out.println("Dados iniciais do Cliente");
        System.out.println("  ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo disponivel: R$ " + saldoInicial );
        System.out.println("  ");
        System.out.println("*******************************************");

        while (true) {
            System.out.println("""
                    Operações:
                                        
                    [1] Consultar Saldo
                    [2] Receber Valor
                    [3] Transferir Valor
                    [4] Sair
                                        
                    """);
            System.out.println("Digite a opção desejada: ");
            int opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.printf("O Saldo atual do correntista %s é: R$%.2f%n", nome, saldoInicial);
            } else if (opcao == 2){
                System.out.println("Qual valor deseja receber: R$");
                double valorRecebido = leitura.nextDouble();
                if (valorRecebido < 0) {
                    System.out.println("Não é possível transferir valor menor que 0");
                } else {
                    saldoInicial += valorRecebido;
                    System.out.println("Saldo atual R$ " + saldoInicial);;
                }
            } else if (opcao == 3){
                System.out.println("Valor que deseja transferir: R$");
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldoInicial){
                    System.out.println("Você não tem saldo suficiente");
                } else {
                    saldoInicial -= valorTransferido;
                    System.out.println("Saldo atual R$ " + saldoInicial);
                }
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção Inválida. Tente novamente !");
            }
        }
    }

}