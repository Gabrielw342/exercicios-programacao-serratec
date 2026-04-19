//so adicionando o codigo depois eu conserto
//o mais facil de consertar so trocar algumas letras minusculas
//ta nao e tao facil assim eu rodei o codigo e deu erro por causa de uma linha logo no inicio eu esqueci de adicionar 2 informaçoes
public class MainAtividade3 {

    public static void main(String[] args) {

        try {
           Cliente cliente = new Cliente("Alce Barbuda", "barbudoalce005@gmail.com");
            Pedido pedido = new Pedido(cliente);

            pedido.adicionarItem(new ItemPedido("notebook gamer", 1, 8200));
            pedido.adicionarItem(new ItemPedido("mouse", 2, 50));
            pedido.adicionarItem(new ItemPedido("caixa de som", 1, 280));
            pedido.adicionarItem(new ItemPedido("fone de otima qualidade pra dar aula",999, 280));
            pedido.adicionarItem(new ItemPedido("carregador tipo c", 1, 90));

            pedido.fecharPedido();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro na Atividade 3: " + e.getMessage());
        }
    }
}
