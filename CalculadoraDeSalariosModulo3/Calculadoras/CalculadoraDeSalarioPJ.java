package CalculadoraDeSalariosModulo3.Calculadoras;

public class CalculadoraDeSalarioPJ implements CalculadoraDeSalario<FuncionarioPJ> {

    private final CalculadoraDeImpostoPJ calculadoraDeImposto = new CalculadoraDeImpostoPJ();

    public Double calcularSalarioDoDia(FuncionarioPJ funcionarioPJ) {
        Double salarioBruto = funcionarioPJ.getHorasNormais() * funcionarioPJ.getValorHora();
        return salarioBruto - calculadoraDeImposto.calcularImpostoTotal(salarioBruto);
    }

}
