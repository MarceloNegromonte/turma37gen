package Lista2;
import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args) {
		//variaveis
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		//entrada de dados
		System.out.println("Digite o primeiro numero: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro numero: ");
		c = leia.nextInt();
		//processamentos
		if(a > b && a > c) {
			System.out.print("Maior numero: ");//saida
			System.out.print(a);
		}else if(b > a && b > c) {
			System.out.print("Maior numero: ");//saida
			System.out.print(b);
		}
		else if(c > a && c > b) {
			System.out.print("Maior numero: ");//saida
			System.out.print(c);
		}
	}

}
