package Lista1;

import java.util.Scanner;

public class AuxilioEmergencial {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//VARIAVEIS
		String nome;
		char pronome;
		boolean chefaFamilia=false;
		boolean naoOutroAuxilio=true;
		final double AUXILIO=600.00;
		final double VALORFILHO=50.00;
		char op;
		int filhos=0;
		//ENTRADAS
		System.out.println("Digite o nome da pessoa: ");
		nome = leia.nextLine();
		System.out.println("Digite o pronome de tratamento: ");
		pronome = leia.next().toLowerCase().charAt(0);
		System.out.println("Chefa de familia S/N : ");
		op = leia.next().toUpperCase().charAt(0);
		
		if (op=='S') {
			chefaFamilia = true;
		}
		System.out.println("Já recebeu outro auxilio? ");
		op = leia.next().toUpperCase().charAt(0);
		if (op=='S') {
			naoOutroAuxilio=false;
		}
		System.out.println("Quantidade de filho: ");
		filhos = leia.nextInt();
		
		if (chefaFamilia && naoOutroAuxilio) {
			System.out.printf("Olá Sr$c. Você vai receber de auxilio $.2f, mais R$",(VALORFILHO*filhos)," do(s) filho(s)",pronome,(AUXILIO*2));
		}else if(naoOutroAuxilio) {
			System.out.printf("Olá sr%c. vai receber auxilio %.2f, mais R$ %.2f do(s) filho(s)",pronome,AUXILIO,(VALORFILHO*filhos));
		}
		
		
	}
}