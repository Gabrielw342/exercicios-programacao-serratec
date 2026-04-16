//mesmo tendo problemas com o override eu achp que foi de primeira
public final class CarroPasseio extends Veiculo {

    public CarroPasseio(String placa, String marca, double valorLocacaoDiaria,
                        int anoFabricacao, double precoFipe) {
        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if (dias <= 0)
            throw new IllegalArgumentException("valor invalido!! voce deve alugar o veiculo por pelo menos um dia");

        return valorLocacaoDiaria * dias;
    }

    @Override
    public double calcularIpva() {
        if (isentoIpva())
            return 0.0;

        return precoFipe * 0.04;
    }
}
