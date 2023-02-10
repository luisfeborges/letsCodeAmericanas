package CalculadoraDePrecosModulo3;

public class Main {
    
    public static void main(String[] args) throws MuitoLongeException {

        CalculadoraDeFrete calculadoraDeFreteCorreios = new CalculadoraDeFreteCorreios();
        CalculadoraDeFrete calculadoraDeFreteTransportadora = new CalculadoraDeFreteTransportadora();
        CalculadoraDeFrete calculadoraDeFreteViaBike = new CalculadoraDeFreteViaBike();

        CalculadoraDeDesconto calculadoraDeDescontoProgressivo = new CalculadoraDeDescontoProgressivo();
        CalculadoraDeDesconto calculadoraDeDescontoNatal = new CalculadoraDeDescontoNatal();

        CalculadoraDePreco calculadoraDePreco1 = new CalculadoraDePreco(calculadoraDeFreteCorreios, calculadoraDeDescontoProgressivo);
        CalculadoraDePreco calculadoraDePreco2 = new CalculadoraDePreco(calculadoraDeFreteTransportadora, calculadoraDeDescontoProgressivo);
        CalculadoraDePreco calculadoraDePreco3 = new CalculadoraDePreco(calculadoraDeFreteViaBike, calculadoraDeDescontoNatal);


//        CalculadoraDePreco calculadoraDePreco2 = new CalculadoraDePreco(new CalculadoraDeFreteTransportadora(), new CalculadoraDeDescontoBlackFriday());

        Produto produto = new Produto(100.0, 10.00);
        Double km = 20.00;

        try {
            System.out.println("Preco com a calculadora 1");
            System.out.println(calculadoraDePreco1.calcular(produto, km));

            System.out.println("Preco com a calculadora 2");
            System.out.println(calculadoraDePreco2.calcular(produto, km));


            System.out.println("Preco com a calculadora 3");
            System.out.println(calculadoraDePreco3.calcular(produto, km));
        } catch (MuitoLongeException e) {
            System.out.println(e.getMessage());
        }
    }

}
