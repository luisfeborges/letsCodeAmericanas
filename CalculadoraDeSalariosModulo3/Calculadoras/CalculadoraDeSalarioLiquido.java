package CalculadoraDeSalariosModulo3.Calculadoras;

import CalculadoraDeSalariosModulo3.Classes.Funcionario;

public class CalculadoraDeSalarioLiquido {

    public static Double calcularSalarioLiquido(Funcionario funcionario) {

        Double salarioBruto = 0.0;
        Double descontos = 0.0;
        Double bonus = 0.0;

        salarioBruto = funcionario.getSalarioBruto();
        descontos = funcionario.getDescontos();
        bonus = funcionario.getBonus();

        return salarioBruto + bonus - descontos;
    }

}
