//fiz o upload da primeira metade do codigo  e ate aqui por enquanto tudo rodou
//fiz o restante e tentei deixar o codigo mais bonitinho 
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 1650;
        int opcao;
        int quantidadeSaques = 0;

        do {
            System.out.println("Bem vindo ao um sistema de banco 100% real");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);

                case 2:
                    System.out.println("Digite o valor do depósito:");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 3:
                    if (quantidadeSaques >= 3) {
                        System.out.println("Limite de saques atingido!");
                    } else {
                        System.out.println("Digite o valor para saque:");
                        double saque = sc.nextDouble();

                        if (saque > 1000) {
                            System.out.println("Valor máximo por saque é R$ 1.000,00.");
                        } else if (saque > saldo) {
                            System.out.println("Saldo insuficiente.");
                        } else {
                            saldo -= saque;
                            quantidadeSaques++;
                            System.out.println("Saque realizado com sucesso!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida... qual parte de digitar 0,1,2,3 voce nao entedeu?");
            }

        } while (opcao != 0);

        sc.close();
    }
}
