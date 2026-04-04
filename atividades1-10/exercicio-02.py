// so o codigo 80% feito mas eu tenho que consertar os {} e algumas outras coisas mas faco isso depois
// parte que cria o sistema  e quais funçoes ele deve chamar
public class Main {
    public static void main(String[] args) {
        public class bancoconta {

            private int numero;
            private double saldo;
            private String titular;
            public bancoconta (int numero, String titular) {

                bancoconta conta= new bancoconta(6665 "Vinho Diezel");
                this.numero = numero;
                this.titular = titular;
                this.saldo = 50.0;

            }

            //se tudo der certo essa e a parte que faz o deposito do dinheiro na conta

            public void depositar (double valor);
            if (valor > 0)

            {
                saldo += valor;
                System.out.println("o deposito foi um sucesso!")
                    else
                System.out.printl("impossivel realizer esse deposito insira um numero positivo  tente novamente");
            }

            //agora a parte de saque

            public void sacar (double valor)
            if (valor <= 0)
                System.out.println("Valor invalido para saque tente outro valor por favor");
            else if (valor > saldo)
                System.out.println("saldo insoficiente tente outro valor por favor")
            else
                saldo -=
               System.out.println("saque foi realizado com sucesso!")



            //agora a ultima e a parte mais facil de so checar a conta
            public void exibirConta() {
                System.out.println("Número: " + numero);
                System.out.println("Titular: " + titular);
                System.out.println("Saldo: R$ " + saldo);
            }




        }

    }


    }
