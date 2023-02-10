package CalculadoraDeSalariosModulo3;

import CalculadoraDeSalariosModulo3.Calculadoras.CalculadoraDeSalarioLiquido;
import CalculadoraDeSalariosModulo3.Classes.Funcionario;

public class Main {
    
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setSalarioBruto(2500.00);
        funcionario.setBonus(200.00);
        funcionario.setDescontos(1600.00);

        System.out.println(CalculadoraDeSalarioLiquido.calcularSalarioLiquido(funcionario));
    }

}
