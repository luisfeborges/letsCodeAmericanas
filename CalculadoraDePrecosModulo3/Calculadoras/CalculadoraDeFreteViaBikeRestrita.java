package CalculadoraDePrecosModulo3.Calculadoras;

public class CalculadoraDeFreteViaBikeRestrita extends CalculadoraDeFreteViaBike {


    @Override
    public Double calcular(Produto produto, Double km) throws MuitoLongeException {

        if (km > 150) {
            throw new RuntimeException("Ta ficando maluco?");
        }

        Double valorKm = 0.4;

        if (km > 5.00) {
            valorKm = 1.0;
        }

        return produto.getPeso() * km * valorKm;
    }

}
