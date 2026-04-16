//o codigo completo e dessa vez por um algum milagre eu acertei tudo de primeira 
public class Main {

    public static void main(String[] args) {

        try {
            Caminhao caminhao = new Caminhao(
                    "ABC-1234", "VUC",
                    500, 2012,
                    300000, 10
            );

            CarroPasseio carro = new CarroPasseio(
                    "ODG-0284", "FUSCA",
                    80, 1980,
                    5000
            );

            System.out.println("Locação caminhão: R$ " +
                    caminhao.alugarVeiculo(12, 3));
            System.out.println("IPVA caminhão: R$ " +
                    caminhao.calcularIpva());

            System.out.println("\nLocação carro: R$ " +
                    carro.alugarVeiculo(0, 5));
            System.out.println("IPVA carro: R$ " +
                    carro.calcularIpva());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro na Atividade 4: " + e.getMessage());
        }
    }
}
