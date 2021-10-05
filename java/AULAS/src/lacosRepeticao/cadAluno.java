package lacosRepeticao;

import java.util.Scanner;

public class cadAluno {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome[] = new String[4]; // 0-3
		int nota[] = {0,0,0,0};
		char disciplinaNota[]= new char[4];
		String disciplina[] = {"1-MATEMATICA","2-PORTUGUÊS","3-CIÊNCIAS","4-ARTES"};
		
		for (int x=0; x<4;x++) {
			System.out.println("Digite o nome do aluno: ");
			nome[x] = leia.next();
			
			for (int i=0; i<disciplina.length;i++) {
				System.out.println(disciplina[i]+" ");
			}
			System.out.println("Digite o codigo da discilpina: ");
			disciplinaNota[x] = leia.next().charAt(0);
			System.out.println("Digite a nota de ");
			nota[x] = leia.nextInt();
		}
		
		for(int y=0;y<4;y++) {
			if (disciplinaNota[y]=='1') {
				System.out.println(nome[y]+" NOTA MATEMATICA "+nota[y]);
			}
			else if (disciplinaNota[y]=='2') {
				System.out.println(nome[y]+"  NOTA PORTUGUÊS "+nota[y]);
			}
		}
		
	}
}
