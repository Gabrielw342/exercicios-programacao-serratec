// so o codigo 80% feito mas eu tenho que consertar os {} e algumas outras coisas mas faco isso depois
//agora sim eu 98% de certeza que esta tudo certo e que ele pode rodar direito
//ultimo conserto porque so agora que eu vi que as chaves no final do codigo estavam erradas
public class Main {
    public static void main(String[] args) {

        bancoconta conta = new bancoconta(6665, "Vinho Diezel");

        conta.depositar(100);
        conta.sacar(50);
        conta.exibirConta();
    }
}

class bancoconta {

    private int numero;
    private double saldo;
    private String titular;

    public bancoconta(int numero, String titular) {

        // REMOVIDO: criação infinita de objetos
        this.numero = numero;
        this.titular = titular;
        this.saldo = 50.0;

    }

    //se tudo der certo essa e a parte que faz o deposito do dinheiro na conta

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("o deposito foi um sucesso!");
        } else {
            System.out.println("impossivel realizer esse deposito insira um numero positivo  tente novamente");
        }
    }

    //agora a parte de saque

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para saque tente outro valor por favor");
        } else if (valor > saldo) {
            System.out.println("saldo insoficiente tente outro valor por favor");
        } else {
            saldo -= valor;
            System.out.println("saque foi realizado com sucesso!");
        }
    }

    //agora a ultima e a parte mais facil de so checar a conta
    public void exibirConta() {
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

}
