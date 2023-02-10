package CalculadoraDePrecosModulo3.Calculadoras;

import CalculadoraDePrecosModulo3.Classes.Produto;
import CalculadoraDePrecosModulo3.Interfaces.CalculadoraDeDesconto;

public class CalculadoraDeDescontoBlackFriday implements CalculadoraDeDesconto{

    @Override
    public Double calcular(Produto produto) {
        return produto.getPreco() * 0.8;
    }


}