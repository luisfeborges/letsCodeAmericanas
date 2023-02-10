package CalculadoraDeSalariosModulo3.Validadores;

public class ValidaBonus {
    public static boolean validadorBonus(Double bonus) {
        if(bonus > 1000) {
            return false;
        }

        return true;
    }
}
