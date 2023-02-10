package CalculadoraDeSalariosModulo3.Classes;

import CalculadoraDeSalariosModulo3.Validadores.ValidaBonus;
import CalculadoraDeSalariosModulo3.Validadores.ValidaDesconto;
import CalculadoraDeSalariosModulo3.Validadores.ValidaSalarioBruto;

public class Funcionario{
    
    private Double salarioBruto;
    private Double descontos;
    private Double bonus;

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        boolean validacaoSalarioBruto = ValidaSalarioBruto.validadorSalarioBruto(salarioBruto);

        if(validacaoSalarioBruto == false) {
            throw new RuntimeException("O salário bruto não pode ser inferior ao salário mínimo");
        }

        this.salarioBruto = salarioBruto;
    }

    public Double getDescontos() {
        return descontos;
    }

    public void setDescontos(Double descontos) {
        boolean validacaoDesconto = ValidaDesconto.validadorDesconto(descontos, getSalarioBruto());

        if(validacaoDesconto == false) {
            throw new RuntimeException("O desconto não pode ser maior que o salário");
        }

        this.descontos = descontos;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        boolean validacaoBonus = ValidaBonus.validadorBonus(bonus);
        
        if(validacaoBonus == false) {
            throw new RuntimeException("O bonus não pode ser maior que 1000.00");
        }
        
        this.bonus = bonus;
    }

}
