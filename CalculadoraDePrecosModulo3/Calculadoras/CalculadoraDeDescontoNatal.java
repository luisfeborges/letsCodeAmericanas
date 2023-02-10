package CalculadoraDePrecosModulo3.Calculadoras;

import CalculadoraDePrecosModulo3.Classes.Produto;
import CalculadoraDePrecosModulo3.Interfaces.CalculadoraDeDesconto;

public class CalculadoraDeDescontoNatal implements CalculadoraDeDesconto {

    public Double calcular(Produto produto) {
        Double preco = produto.getPreco();
        return preco * 0.25;
    }

}
