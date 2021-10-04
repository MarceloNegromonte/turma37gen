package Lista2;
import java.util.Scanner;

public class tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("CATEGORIA INFANTIL");
		}else if (idade >= 15 && idade <= 17) {
			System.out.println("CATEGORIA JUVENIL");
		}else if (idade >= 18 && idade >= 25) {
			System.out.println("CATEGORIA ADULTO");
		}
		else {
			System.out.println("Desculpe, ainda não tem idade.");
		}
	}

}
