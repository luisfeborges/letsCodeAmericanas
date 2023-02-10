package CalculadoraDeSalariosModulo3.Validadores;

public class ValidaSalarioBruto {

    public static boolean validadorSalarioBruto(Double salarioBruto) {
        if(salarioBruto < 1302) {
            return false;
        }

        return true;
    }
}
