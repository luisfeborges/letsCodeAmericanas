package CalculadoraDeSalariosModulo3.Classes;

import CalculadoraDeSalariosModulo3.Interfaces.RealizaHoraExtra;

public class FuncionarioCLT extends Funcionario implements RealizaHoraExtra {

    private Integer horasExtras;

    public Integer getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(Integer horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Double obterPercentualHoraExtra() {
        return 0.3;
    }

    @Override
    public Integer obterQuantidadeDeHorasExtras() {
        return getHorasExtras();
    }
}