package Lista1;
import java.util.Scanner;

public class lista1Tarefa7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		System.out.println("Digite o valor de D: ");
		d = leia.nextInt();
		System.out.println("Digite o valor de E: ");
		e = leia.nextInt();
		System.out.println("Digite o valor de F: ");
		f = leia.nextInt();
		
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*a)/(a*e)-(b*d));
		
		System.out.print("O valor de X é: ");
		System.out.println(x);
		System.out.print("O valor de Y é: ");
		System.out.println(y);
	}
}
