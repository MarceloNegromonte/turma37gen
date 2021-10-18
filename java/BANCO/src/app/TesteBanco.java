package app;

import java.util.Scanner;

import entities.Poupanca;

public class TesteBanco {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int numero;
		String cpf;
		int diaAniversarioConta, auxDia;
		char op;
		double valor;
		
		System.out.println("Digite o numero da conta :");
		numero = leia.nextInt();
		System.out.println("Digite o CPF do cliente :");
		cpf = leia.next();
		System.out.println("Digite o di ado aniversário da conta :");
		diaAniversarioConta = leia.nextInt();
		
		Poupanca cp1 = new Poupanca(1,"111.111.111-11",1);
		
		for (int x=1; x<=10; x++) {
			System.out.println("Digite o valor R$ ");
			valor = leia.nextDouble();
			System.out.println("D-débito ou C-crédito :");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'D') {
				cp1.debito(valor);
			}
			else if (op == 'C') {
				cp1.credito(valor);
			}
			else {
				System.out.println("Opção escolhida invalida!");
			}
			
			System.out.println("Continuar S/N : ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'N') {
				break;
			}
		}
		
		System.out.println("Saldo atual: "+cp1.getSaldo());	
		System.out.println("Informe o dia de hoje :");
		auxDia = leia.nextInt();
		cp1.correca(auxDia);
		System.out.println("Saldo corrigido R$: "+cp1.getSaldo());
		

}

}	