package CalculadoraDePrecosModulo3.Calculadoras;

public class CalculadoraDeDescontoProgressivo implements CalculadoraDeDesconto {

    public Double calcular(Produto produto) {
        Double preco = produto.getPreco();

        if (preco >= 1_000.00) {
            // 20% de desconto
            return preco * 0.2;
        } else if (preco >= 500.00) {
            // 10% de desconto
            return preco * 0.1;
        }

        // 5% de desconto
        return preco * 0.05;
    }

}
