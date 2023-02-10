package CalculadoraDePrecosModulo3.Calculadoras;

public class CalculadoraDeFreteCorreios implements CalculadoraDeFrete{

    public Double calcular(Produto produto, Double km) {
        return produto.getPeso() * km * 0.5;
    }

}
