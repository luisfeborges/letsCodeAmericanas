package CalculadoraDeSalariosModulo3.Calculadoras;

public class CalculadoraDeImpostoPF implements CalculadoraDeImpostoInterface{

    @Override
    public Double calcularINSS(Double valor) {
        return valor * 0.1;
    }

    @Override
    public Double calcularISS(Double valor) {
        throw new RuntimeException("PF não paga ISS");
    }

    @Override
    public Double calcularImpostoDeRenda(Double valor) {
        return valor * 0.2;
    }

    @Override
    public Double calcularImpostoTotal(Double valor) {
        return calcularINSS(valor) + calcularImpostoDeRenda(valor);
    }

}
