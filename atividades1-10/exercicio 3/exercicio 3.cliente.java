//so botando o codigo inicial eu ainda tenho que consertar mas isso e problema do gabriel do futuro

public class cliente {
    private String nome;

    public cliente(String nome) {
        if (nome == null || nome.isEmpty())
            throw new IllegalArgumentException("nome invalidade tente novaamentr");
        this.nome = nome;
    }
}
