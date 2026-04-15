//so botando o codigo inicial eu ainda tenho que consertar mas isso e problema do gabriel do futuro
//bom eu sou o gabriel do futuro e eu conserte o nome cliente pra Cliente porque a letra minuscula tava dando problema
public class Cliente {

    private String nome;

    public Cliente(String nome) {
        if (nome == null || nome.isEmpty())
            throw new IllegalArgumentException("nome invalidade tente novaamentr");
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
