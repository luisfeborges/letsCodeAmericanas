package CalculadoraDePrecosModulo3.Calculadoras;

public class CalculadoraDeDescontoNatal implements CalculadoraDeDesconto {

    public Double calcular(Produto produto) {
        Double preco = produto.getPreco();
        return preco * 0.25;
    }

}
