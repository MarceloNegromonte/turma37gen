package Lista4;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa2Matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);	
		Scanner leia = new Scanner(System.in);
	
		int [][] mat = new int[3][3];
		int l,c;
		int somaMat=0;
		int somaDiagonal=0;
		int z=0;
		
		for (l=0;l<3;l++) {
			for (c=0;c<3;c++) {
				System.out.print("Digite o valor: ");
				mat[l][c] = leia.nextInt();
			}
		}
		for (l=0;l<3;l++) {
			for (c=0;c<3;c++) {
				somaMat = somaMat + mat[l][c];
			}
			System.out.println();
		}
		for (int x=0;x<3;x++) {
			somaDiagonal = somaDiagonal + mat[x][x];
		}
		System.out.println("A soma total da matriz é: "+somaMat);
		System.out.println("A soma a diagonal principa da matriz é: "+somaDiagonal);
		
	}

}
