package Lista3;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		int soma21=0;
		int soma50=0;
		
		while(idade !=-99) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			if(idade<=21 && idade>=1) {
				soma21 = soma21+1 ; 
			}else if(idade>=50) {
				soma50 = soma50+1;
			}
		}
		System.out.println("Pessoas com menos de 21 anos: "+soma21);
		System.out.println("Pessoas com mais de 50 anos: "+soma50);
	}
}
