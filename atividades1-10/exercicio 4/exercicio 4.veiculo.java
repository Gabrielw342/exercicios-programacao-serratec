//precisei rever algumas aulas mas consegui fazer o abstract e protected funcionar
public abstract sealed class Veiculo
implements Fretavel, Tributavel
permits Caminhao, CarroPasseio {

    protected final String placa;
    protected final String marca;
    protected final double valorLocacaoDiaria;
    protected final int anoFabricacao;
    protected final double precoFipe;

    public Veiculo(String placa,
                   String marca,
                   double valorLocacaoDiaria,
                   int anoFabricacao,
                   double precoFipe) {

        if (placa == null || placa.isEmpty())
            throw new IllegalArgumentException("plava nao existe");

        if (valorLocacaoDiaria <= 0 || precoFipe <= 0)
            throw new IllegalArgumentException("valor invalido");

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;

    }

    protected boolean isentoIpva() {
        int anoAtual = java.time.Year.now().getValue();
        return (anoAtual - anoFabricacao) > 20;
    }
}


