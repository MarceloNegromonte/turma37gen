package entities;

public class terceiro extends Funcionario {

	//variavel
	private double adicional;

	//construtor
	public terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}
	
	//encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}


	//sobre escrever
	@Override
	public double calculoSalario() {
		
		//colocando a m�e no meio
		return ((super.getHorasTrabalhadas()*super.getValorHora())+this.adicional)
		
		//outro metodo seria pela mudan�a do atributo para protect na class m�e.	
		//((return this.horasTrabalhadas*this.valorHora)  + this.adicional);
	}
}
