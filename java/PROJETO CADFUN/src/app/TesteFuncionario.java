package app;

import entities.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
	
	Funcionario funcionario = new Funcionario("222","marcelo");
	
	funcionario.setHorasTrabalhadas(80);
	funcionario.setValorHora(10);
	
	System.out.println(funcionario.calculoSalario());
	System.out.printf(funcionario.getNome()+funcionario.getMatricula());
	
	
	
	}
	
	
}
