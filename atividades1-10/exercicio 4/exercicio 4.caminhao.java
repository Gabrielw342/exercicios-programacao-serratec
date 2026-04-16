//adicionei o codigo completo e dessa vez acho que nem precisei consertar nada
public final class Caminhao extends Veiculo {

    private final double capacidadeCargaToneladas;

    public Caminhao(String placa,
                    String marca,
                    double valorLocacaoDiaria,
                    int anoFabricacao,
                    double precoFipe,
                    double capacidadeCargaToneladas) {

        super(placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);

        if (capacidadeCargaToneladas <= 0)
            throw new IllegalArgumentException("capacidade invalido o caminhao deve carregar algo");

        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {

        if (pesoCarga <= 0 || dias <= 0)
            throw new IllegalArgumentException("valores invalidos tente outro valor por favor");

        double total = valorLocacaoDiaria * dias;

        if (pesoCarga > capacidadeCargaToneladas) {
            total *= 1.10;

        }

        return  total;

    }

    @Override
    public double calcularIpva() {
        if (isentoIpva())
            return 0.0;
        return precoFipe * 0.15;
    }

}
