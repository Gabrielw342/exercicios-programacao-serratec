// so o codigo 80% feito mas eu tenho que consertar os {} e algumas outras coisas mas faco isso depois
//agora sim eu 98% de certeza que esta tudo certo e que ele pode rodar direito
//consetando main e funcao separadando eles e claro

public class Main {
    public static void main(String[] args) {

        BancoConta conta = new BancoConta(6665, "Vinho Diezel");

        conta.depositar(100);
        conta.sacar(50);
        conta.exibirConta();
    }
}
