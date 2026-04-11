//so depois de conversar com meu grupo que eu pereci que era pra dividr as funcçoes enao fazendo isso agora em plen sabado
class BancoConta {

    private int numero;
    private double saldo;
    private String titular;

    public BancoConta(int numero, String titular) {

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
            System.out.println("impossivel realizer esse deposito insira um numero positivo e tente novamente");
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
