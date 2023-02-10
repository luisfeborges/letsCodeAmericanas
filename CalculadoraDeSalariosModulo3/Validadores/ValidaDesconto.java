package CalculadoraDeSalariosModulo3.Validadores;

public class ValidaDesconto {
    public static boolean validadorDesconto(Double desconto, double salarioBruto) {
        if(desconto > salarioBruto) {
            return false;
        }

        return true;
    }
}
