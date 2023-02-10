package CalculadoraDePrecosModulo3.Calculadoras;

public class CalculadoraDeFreteTransportadora implements CalculadoraDeFrete{

    public Double calcular(Produto produto, Double km) {
        double precoKm = 0.6;
        if (km >= 100.00) {
            precoKm = 0.3;
        }
        return produto.getPeso() * km * precoKm;
    }

}
