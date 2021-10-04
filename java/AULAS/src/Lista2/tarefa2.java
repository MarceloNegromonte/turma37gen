package Lista2;
import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		//variaveis
		Scanner leia = new Scanner(System.in);

		int a, b, c;
		//entradas de dados
		System.out.println("Digite o primeiro numero: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro numero: ");
		c = leia.nextInt();
		
		//processamentos
		if(a >= b && a >= c && b >= c) {
			System.out.print("Ordem crescente: ");//saida
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
		}else if(a >= b && a >= c && b <= c) {
			System.out.print("Ordem crescente: ");//saida
			System.out.print(b);
			System.out.print(c);
			System.out.print(a);
		}else if(a <= b && b >= c && a >= c) {
			System.out.print("Ordem crescente: ");//saida
			System.out.print(c);
			System.out.print(a);
			System.out.print(b);
		}else if(a <= b && b >= c && a <= c) {
			System.out.print("Ordem crescente: ");//saida
			System.out.print(a);
			System.out.print(c);
			System.out.print(b);
		}else if(c >= a && b <= c && a >= b) {
			System.out.print("Ordem crescente: ");//saida
			System.out.print(b);
			System.out.print(a);
			System.out.print(c);
		}
		else if(c >= a && b <= c && a <= b) {
			System.out.print("Ordem crescente: ");//saida
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
		}
	
	}

}
