package Lista5;

import java.util.Scanner;

public class TesteBanco {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Tarefa6Banco banco = new Tarefa6Banco();
		
		System.out.println("Digite o nome do cliente: ");
		banco.setNome(leia.next());
		System.out.println("Digite o codigo do cliente:  ");
		banco.setCodigo(leia.nextInt());
		System.out.println("Saldo atual é: ");
		banco.setSaldo(leia.nextDouble());
		System.out.println("Quando gostaria de sacar? ");
		banco.setSaldoAtual(leia.nextDouble());
	
		System.out.println(banco.toString());
	}

}
