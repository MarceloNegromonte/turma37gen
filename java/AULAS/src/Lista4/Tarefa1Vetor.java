package Lista4;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa1Vetor {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int pontos[] = {0,0,0,0,0};
		int maiorPonto=0;
		
		for (int x=0;x<=4;x++) {
			System.out.print("Digite a "+(x+1)+"ª nota:");
			pontos[x] = leia.nextInt();
			if (maiorPonto<=pontos[x]) {
				maiorPonto = pontos[x];
			}
		}
		
		for (int i=0;i<=4;i++) {
			System.out.println("Pontos colocados na "+(i+1)+"ª posição: "+pontos[i]);
		}
		System.out.println("Maior pontuação foi: "+maiorPonto);
	
	}
}
