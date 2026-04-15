//so adicionando o codigo depois eu conserto
//o mais facil de consertar so trocar algumas letras minusculas
public class MainAtividade3 {

    public static void main(String[] args) {

        try {
            Cliente cliente = new Cliente("Gabriel");
            Pedido pedido = new Pedido(cliente);

            pedido.adicionarItem(new ItemPedido("notebook gamer", 1, 8200));
            pedido.adicionarItem(new ItemPedido("mouse", 2, 50));
            pedido.adicionarItem(new ItemPedido("caixa de som", 1, 280));
            pedido.adicionarItem(new ItemPedido("fone de otima qualidade", 1, 480));
            pedido.adicionarItem(new ItemPedido("carregador tipo c", 1, 90));

            pedido.fecharPedido();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro na Atividade 3: " + e.getMessage());
        }
    }
}
