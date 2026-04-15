//so botando o codigo inicial eu ainda tenho que consertar mas isso e problema do gabriel do futuro
//consertei o =+ pra += e troquei denovo o nome de algumas classes porque tava dando erro e porque era confuso
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(Cliente cliente) {
        if (cliente == null)
            throw new IllegalArgumentException("cliente nao e valido");
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        if (item == null)
            throw new IllegalArgumentException("item invalido... tente novamente por favor");
        itens.add(item);
    }

    public void fecharPedido() {

        double totalitens = 0;

        for (ItemPedido item : itens) {
            totalitens += item.getSubtotal();
        }

        double frete = totalitens > 250 ? 0 : 25;
        double totalfinal = totalitens + frete;

        System.out.println("\n===== RECIBO =====");
        System.out.println("Cliente: " + cliente.getNome());

        for (ItemPedido item : itens) {
            System.out.println("- " + item.getSubtotal());
        }

        System.out.println("valor total dos itens: R$ " + totalitens);
        System.out.println("frete: R$ " + frete);
        System.out.println("o valor total e: R$ " + totalfinal);
    }
}
