package app;

import java.util.Scanner;

import entities.Conta;

public class CadConta {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //SISTEM IN = CONSTRUTOR
		//Cria��o do objeto
		//cria��o a partir do 0, cliente colocar informa��o!
		System.out.println("Digite o n�mero da conta: ");
		int auxConta = leia.nextInt();
		System.out.println("Digite o cfp da conta: ");
		String auxCpf = leia.next();
		Conta cc1 = new Conta(auxConta,auxCpf);
		
		
		System.out.println("Cliente "+cc1.getCpf()+"  nummero da sua conta: "+cc1.getNumero());
		System.out.println("Ativa a conta sim ou n�o? ");
		char op = leia.next().charAt(0);
		if (op=='S') { //ativar o metodo ativar conta
			cc1.ativarConta();
		}
	
		//ambiente pra o usuario
		System.out.println("Saldo atual R$ "+cc1.getSaldo());
		System.out.println("Registando 4 movimentos");
		for (int x=1 ; x<=5 ; x++) {
			System.out.println("Lan�amento "+x);
			System.out.println("Digite o valor R$ ");
			double auxValor = leia.nextDouble();
			System.out.println("D-d�bito ou C-credito: ");
			op = leia.next().toUpperCase().charAt(0);
			if (op == 'C' && cc1.isAtiva()) {
				cc1.credito(auxValor);
			} else if (op =='D' && cc1.isAtiva()) {
				cc1.debito(auxValor);
			}
		}
	}

}
