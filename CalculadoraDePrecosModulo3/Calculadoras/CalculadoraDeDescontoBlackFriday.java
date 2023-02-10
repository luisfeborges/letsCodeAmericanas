package CalculadoraDePrecosModulo3.Calculadoras;

public class CalculadoraDeDescontoBlackFriday implements CalculadoraDeDesconto{

    @Override
    public Double calcular(Produto produto) {
        return produto.getPreco() * 0.8;
    }


}