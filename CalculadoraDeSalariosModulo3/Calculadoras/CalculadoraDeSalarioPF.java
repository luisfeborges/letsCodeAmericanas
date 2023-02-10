package CalculadoraDeSalariosModulo3.Calculadoras;

public class CalculadoraDeSalarioPF implements CalculadoraDeSalario<FuncionarioCLT> {
    private final CalculadoraDeImpostoPF calculadoraDeImposto = new CalculadoraDeImpostoPF();
    private final CalculadoraDeHoraExtraService<FuncionarioCLT> calculadoraDeHoraExtraService = new CalculadoraDeHoraExtraService();

    public Double calcularSalarioDoDia(FuncionarioCLT funcionarioCLT) {

        Double valorHoraExtra = 0.0;
        Double valorHorasNormais = 0.0;

        int totalDeHoras = funcionarioCLT.getHorasNormais() + funcionarioCLT.getHorasExtras();

        if (totalDeHoras > 8) {
            valorHoraExtra = calculadoraDeHoraExtraService.calcularHoraExtra(funcionarioCLT);
        }

        valorHorasNormais = funcionarioCLT.getHorasNormais() * funcionarioCLT.getValorHora();

        Double salarioBruto =  valorHorasNormais + valorHoraExtra;
        return salarioBruto - calculadoraDeImposto.calcularImpostoTotal(salarioBruto);

    }

}
