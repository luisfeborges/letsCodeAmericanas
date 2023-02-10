package CalculadoraDeSalariosModulo3.Classes;

public abstract class Funcionario {
    
    private Double valorHora;
    private Integer horasNormais;

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHorasNormais() {
        return horasNormais;
    }

    public void setHorasNormais(Integer horasNormais) {
        this.horasNormais = horasNormais;
    }

}
