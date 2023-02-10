package CalculadoraDeSalariosModulo3.Calculadoras;

public interface CalculadoraDeSalario<T extends Funcionario> {

    Double calcularSalarioDoDia(T funcionario);

}
