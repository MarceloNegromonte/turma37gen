package Funcao;

import java.util.Locale;
import java.util.Scanner;

public class funcao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da linha: ");
		int tamanho = leia.nextInt();
		linha(tamanho);
		System.out.println("Digite um número inteiro positivo: ");
		int numero = leia.nextInt();
		}

		//FIM DA FUNÇÃO MAIN-PRINCIPAL.
	
//função void(vazia)
	public static void linha(int tamanho) {	
		for (int x=1; x<=tamanho;x++) {
			System.out.print("=");
			if(x<=20) {
				System.out.print("░");//176
			}else if(x<=40) {
				System.out.print("▒");//177
			}
			else {
				System.out.print("▓");//178
			}
			
		}
	}	//FIM DO PROGAMA

	public static String parImparSemRetorno(int numero) {
		String resposta;
		
		resposta = "2";
		
		return resposta;
	}
}
	

