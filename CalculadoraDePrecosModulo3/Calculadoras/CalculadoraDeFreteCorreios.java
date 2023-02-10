package CalculadoraDePrecosModulo3.Calculadoras;

import CalculadoraDePrecosModulo3.Classes.Produto;
import CalculadoraDePrecosModulo3.Interfaces.CalculadoraDeFrete;

public class CalculadoraDeFreteCorreios implements CalculadoraDeFrete{

    public Double calcular(Produto produto, Double km) {
        return produto.getPeso() * km * 0.5;
    }

}
