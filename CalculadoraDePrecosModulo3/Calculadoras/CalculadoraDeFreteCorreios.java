package CalculadoraDePrecosModulo3.Calculadoras;

import CalculadoraDePrecosModulo3.Classes.Produto;
import CalculadoraDePrecosModulo3.Interfaces.CalculadoraDeFrete;

public class CalculadoraDeFreteCorreios implements CalculadoraDeFrete{

    public Double calcular(Produto produto, Double km) {
        if (km  < 0) {
            throw new RuntimeException("Insira um valor de distância válido");
        }
        
        return produto.getPeso() * km * 0.5;
    }

}
