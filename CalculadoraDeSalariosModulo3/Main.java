package CalculadoraDeSalariosModulo3;

import CalculadoraDeSalariosModulo3.Calculadoras.CalculadoraDeSalario;
import CalculadoraDeSalariosModulo3.Calculadoras.CalculadoraDeSalarioPF;
import CalculadoraDeSalariosModulo3.Calculadoras.CalculadoraDeSalarioPJ;
import CalculadoraDeSalariosModulo3.Classes.Funcionario;
import CalculadoraDeSalariosModulo3.Classes.FuncionarioCLT;
import CalculadoraDeSalariosModulo3.Classes.FuncionarioPJ;

public class Main {
    
    public static void main(String[] args) {


        FuncionarioPJ funcionarioPJ = new FuncionarioPJ();
        funcionarioPJ.setHorasNormais(10);
        funcionarioPJ.setValorHora(100.00);

        FuncionarioCLT funcionarioCLT = new FuncionarioCLT();
        funcionarioCLT.setHorasNormais(8);
        funcionarioCLT.setHorasExtras(2);
        funcionarioCLT.setValorHora(50.00);


        System.out.println(calcularSalario(new CalculadoraDeSalarioPJ(), funcionarioPJ));
        System.out.println(calcularSalario(new CalculadoraDeSalarioPF(), funcionarioCLT));


    }

    public static Double calcularSalario(CalculadoraDeSalario calculadoraDeSalario, Funcionario funcionario) {
        return calculadoraDeSalario.calcularSalarioDoDia(funcionario);
    }

}
