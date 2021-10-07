package Lista5;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Tarefa1Cliente cliente = new Tarefa1Cliente();
		
		System.out.println("Digite o nome do cliente: ");
		cliente.setNome(leia.next());
		System.out.println("Digite a idade do cliente: ");
		cliente.setIdade(leia.nextInt());
		System.out.println("Digite o código do cliente: ");
		cliente.setCodigo(leia.next());
		System.out.println("Como o gostaria de ser tratado O/A/E");
		cliente.setPronome(leia.next().charAt(0));
		
		System.out.println(cliente.toString());
	}

}
