package CalculadoraDeSalariosModulo3.Calculadoras;

import CalculadoraDeSalariosModulo3.Classes.FuncionarioPJ;

public class CalculadoraDeSalarioPJ implements CalculadoraDeSalario<FuncionarioPJ> {

    private final CalculadoraDeImpostoPJ calculadoraDeImposto = new CalculadoraDeImpostoPJ();

    public Double calcularSalarioDoDia(FuncionarioPJ funcionarioPJ) {
        Double salarioBruto = funcionarioPJ.getHorasNormais() * funcionarioPJ.getValorHora();
        return salarioBruto - calculadoraDeImposto.calcularImpostoTotal(salarioBruto);
    }

}
