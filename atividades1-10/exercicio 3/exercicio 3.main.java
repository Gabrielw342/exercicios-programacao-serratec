//so adicionando o codigo depois eu conserto
public class MainAtividade3 {

    public static void main(String[] args) {

        try {
            cliente cliente = new cliente("Gabriel");
            pedido pedido = new pedido(cliente);

            pedido.adicionarItem(new itempedido("notebook gamer", 1, 8200));
            pedido.adicionarItem(new itempedido("mouse", 2, 50));
            pedido.adicionarItem(new itempedido("caixa de som", 1, 280));
            pedido.adicionarItem(new itempedido("fone de otima qualidade", 1, 480));
            pedido.adicionarItem(new itempedido("carregador tipo c", 1, 90));

            pedido.fecharPedido();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro na Atividade 3: " + e.getMessage());
        }
    }
}
