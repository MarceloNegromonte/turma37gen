package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);

		Scanner leia = new Scanner(System.in);

		// variaveis
		double d;
		double x2, x1, y1, y2;
		String nome;

		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite o valor: ");
		x1 = leia.nextDouble();
		System.out.print("Digite o valor: ");
		x2 = leia.nextDouble();
		System.out.print("Digite o valor: ");
		y1 = leia.nextDouble();
		System.out.print("Digite o valor: ");
		y2 = leia.nextDouble();
		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		// processamentos

		// saidas
		System.out.printf("Oi %s o valor de d é %f ", nome,d);
	}
}
