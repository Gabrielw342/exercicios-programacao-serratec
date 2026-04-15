//so botando o codigo inicial eu ainda tenho que consertar mas isso e problema do gabriel do futuro
public class itempedido {

    private String descricao;
    private int quantidade;
    private double  precounitario;

    public itempedido(String descricao, int quantidade, double precounitario) {
        if (quantidade <= 0 || precounitario <= 0)

            throw new IllegalArgumentException("Quantidade ou preço inválidos");

        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precounitario = precounitario;

    }

    public double getsubtotal() {
        return quantidade * precounitario;
    }
}

