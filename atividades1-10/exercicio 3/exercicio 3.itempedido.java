//so botando o codigo inicial eu ainda tenho que consertar mas isso e problema do gabriel do futuro
//bom eu sou o gabriel do futuro e eu tive que trocar o nome da classe pra letras maiscula poque tava dando erro e troque o get nome
public class ItemPedido {

    private String descricao;
    private int quantidade;
    private double precounitario;

    public ItemPedido(String descricao, int quantidade, double precounitario) {
        if (quantidade <= 0 || precounitario <= 0)
            throw new IllegalArgumentException("Quantidade ou preço inválidos");

        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precounitario = precounitario;
    }

    public double getSubtotal() {
        return quantidade * precounitario;
    }
}

