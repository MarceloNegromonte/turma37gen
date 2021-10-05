package Lista3;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero[]= new int [10];
		
		for (int x=0; x<10;x++) {
			System.out.print("Digite o "+(x+1)+"º numero ");
			numero[x] = leia.nextInt();
		}
		for(int x=0;x<10;x++) {
			if(numero[x]%2==0) {
				System.out.println("numero par: "+numero[x]);
			}else if(numero[x]%2==1) {
				System.out.println("numero impar: "+numero[x]);
			}
		}
		


	}

}
