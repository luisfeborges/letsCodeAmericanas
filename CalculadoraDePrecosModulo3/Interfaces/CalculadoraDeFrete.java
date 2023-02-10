package CalculadoraDePrecosModulo3.Interfaces;

import CalculadoraDePrecosModulo3.Calculadoras.MuitoLongeException;
import CalculadoraDePrecosModulo3.Classes.Produto;

public interface CalculadoraDeFrete {

    Double calcular(Produto produto, Double km) throws MuitoLongeException;

}
