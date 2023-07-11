import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                *************************************************
                Dados iniciais do Cliente:
                                
                                
                Nome:               Patrick Rebecchi
                Tipo da Conta:      Conta Corrente
                Saldo inicial:      R$2500,00
                                
                *************************************************
                """);
        String nome = "Patrick Rebecchi ";
        double saldoInicial = 2500.00;
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
            
        }
    }

}