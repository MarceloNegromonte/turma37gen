package Lista2;
import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite o n�mero: ");
		numero = leia.nextInt();
		
		if(numero %2 == 0) {
			System.out.print("Numero PAR, sua raiz quadrada �: ");
			System.out.println(Math. sqrt(numero));
		}else if(numero %2 == 1) {
			System.out.print("Numero IMPAR, seu n�mero elevado ao quadrado �: ");
			System.out.println(Math. pow (numero, 2));
		}
	}

}
