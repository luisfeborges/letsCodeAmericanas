package CalculadoraDePrecosModulo3.Calculadoras;

public class CalculadoraDeFreteViaBike implements CalculadoraDeFrete {


    @Override
    public Double calcular(Produto produto, Double km) throws MuitoLongeException {

        if (km  < 0) {
            throw new RuntimeException("Vou andar pra trás?");
        }

        if (km > 100) {
            throw new RuntimeException("Ta ficando maluco?");
        }

        Double valorKm = 0.4;

        if (km > 20.00) {
            valorKm = 1.0;
        }

        return produto.getPeso() * km * valorKm;
    }

}
