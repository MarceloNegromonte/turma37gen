package Lista5;

import java.util.Scanner;

public class TestePatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		Tarefa5Patinete patinete = new Tarefa5Patinete();
		
		
		System.out.println("Digite a cor do patinete: ");
		patinete.setCor(leia.next());
		System.out.println("Velocidade atual: ");
		patinete.setVelocidadeAtual(leia.nextInt());
		System.out.println("Digite o modelo");
		patinete.setModelo(leia.next());
	
		System.out.println(patinete.toString());
	}

}
