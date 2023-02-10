package CalculadoraDePrecosModulo3.Calculadoras;

import CalculadoraDePrecosModulo3.Classes.Produto;
import CalculadoraDePrecosModulo3.Interfaces.CalculadoraDeDesconto;

public class CalculadoraDeDescontoProgressivo implements CalculadoraDeDesconto {

    public Double calcular(Produto produto) {
        Double preco = produto.getPreco();

        if (preco >= 1000.00) {
            return preco * 0.2;
        } else if (preco >= 500.00) {
            return preco * 0.1;
        }

        return preco * 0.05;
    }

}
