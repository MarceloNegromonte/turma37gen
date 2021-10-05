package Lista3;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero;
		int soma=0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			soma = soma+numero;
		}while(numero != 0);
		
		System.out.println("A soma de todos os números digitados é: "+soma);

	}

}
