package CalculadoraDePrecosModulo3;

import CalculadoraDePrecosModulo3.Calculadoras.CalculadoraDeDescontoProgressivo;
import CalculadoraDePrecosModulo3.Calculadoras.CalculadoraDeFreteCorreios;
import CalculadoraDePrecosModulo3.Calculadoras.CalculadoraDeFreteTransportadora;
import CalculadoraDePrecosModulo3.Calculadoras.CalculadoraDeFreteViaBike;
import CalculadoraDePrecosModulo3.Calculadoras.CalculadoraDePreco;
import CalculadoraDePrecosModulo3.Calculadoras.MuitoLongeException;
import CalculadoraDePrecosModulo3.Classes.Produto;
import CalculadoraDePrecosModulo3.Interfaces.CalculadoraDeDesconto;
import CalculadoraDePrecosModulo3.Interfaces.CalculadoraDeFrete;

public class Main {
    
    public static void main(String[] args) throws MuitoLongeException {

        CalculadoraDeFrete calculadoraDeFreteCorreios = new CalculadoraDeFreteCorreios();
        CalculadoraDeFrete calculadoraDeFreteTransportadora = new CalculadoraDeFreteTransportadora();
        CalculadoraDeFrete calculadoraDeFreteViaBike = new CalculadoraDeFreteViaBike();

        CalculadoraDeDesconto calculadoraDeDescontoProgressivo = new CalculadoraDeDescontoProgressivo();

        CalculadoraDePreco calculadoraDePrecoCorreios = new CalculadoraDePreco(calculadoraDeFreteCorreios, calculadoraDeDescontoProgressivo);
        CalculadoraDePreco calculadoraDePrecoTransportadora = new CalculadoraDePreco(calculadoraDeFreteTransportadora, calculadoraDeDescontoProgressivo);
        CalculadoraDePreco calculadoraDePrecoBike = new CalculadoraDePreco(calculadoraDeFreteViaBike, calculadoraDeDescontoProgressivo);

        Produto produto = new Produto(1500.0, 100.00);
        Double km = 8.00;

        try {
            System.out.println("Preco transportando com os Correios");
            System.out.println(calculadoraDePrecoCorreios.calcular(produto, km));

            System.out.println("Preco transportando com a Transportadora");
            System.out.println(calculadoraDePrecoTransportadora.calcular(produto, km));


            System.out.println("Preco transportando com a bike");
            System.out.println(calculadoraDePrecoBike.calcular(produto, km));
        } catch (MuitoLongeException e) {
            System.out.println(e.getMessage());
        }
    }

}
