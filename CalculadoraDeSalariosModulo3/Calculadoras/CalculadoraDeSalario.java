package CalculadoraDeSalariosModulo3.Calculadoras;

import CalculadoraDeSalariosModulo3.Classes.Funcionario;

public interface CalculadoraDeSalario<T extends Funcionario> {

    Double calcularSalarioDoDia(T funcionario);

}
