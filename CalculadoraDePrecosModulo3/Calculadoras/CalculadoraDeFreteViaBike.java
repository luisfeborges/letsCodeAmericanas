package CalculadoraDePrecosModulo3.Calculadoras;

import CalculadoraDePrecosModulo3.Classes.Produto;
import CalculadoraDePrecosModulo3.Interfaces.CalculadoraDeFrete;

public class CalculadoraDeFreteViaBike implements CalculadoraDeFrete {


    @Override
    public Double calcular(Produto produto, Double km) throws MuitoLongeException {

        if (km  < 0) {
            throw new RuntimeException("Insira um valor de distância válido");
        }

        Double valorKm = 0.4;


        if(km < 12.00) {
            if(km < 5.00){
                valorKm = 0.4;
            } else if(km < 8.00){
                valorKm = 0.7;
            } else{
                valorKm = 1.0;
            }
        } else{
            throw new RuntimeException("Não é possível usar transporte via bike nessa entrega");
        }        

        return produto.getPeso() * km * valorKm;
    }

}
