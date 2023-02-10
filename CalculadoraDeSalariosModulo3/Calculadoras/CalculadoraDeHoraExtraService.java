package CalculadoraDeSalariosModulo3.Calculadoras;

public class CalculadoraDeHoraExtraService<T extends Funcionario & RealizaHoraExtra> {

    public Double calcularHoraExtra(T funcionario) {
        Double valorHora = funcionario.getValorHora();
        Double percentualHoraExtra = funcionario.obterPercentualHoraExtra();
        double valorHoraExtra = (valorHora * percentualHoraExtra) + valorHora;
        return valorHoraExtra * funcionario.obterQuantidadeDeHorasExtras();
    }

}
