import java.util.Scanner;

public class Lista1Tarefa5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float nota1, nota2, nota3, media;
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextFloat();
		
		nota1 = nota1 * 2;
		nota2 = nota2 * 3;
		nota3 = nota3 * 5;
		media = (nota1+nota2+nota3)/10;
		
		System.out.print("A média é: ");
		System.out.println(media);
	}
}
