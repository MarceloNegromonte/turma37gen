import java.util.Scanner;

public class Lista1Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		//variaveis:
		String nome;
		int anoNascimento, diaNascimento, mesNascimento;
		int anoAtual, mesesVividos, mesAtual, diaAtual;
		int diasVividosIncompleto;
		
		//entradas de dados;
		System.out.println("Escreva seu nome? ");
		nome = leia.next();
		System.out.println("Qual o ano que voc� nasceu? ");
		anoNascimento = leia.nextInt();
		System.out.println("Qual m�s voc� nasceu? ");
		mesNascimento = leia.nextInt();
		System.out.println("Qual dia voc� nasceu? ");
		diaNascimento = leia.nextInt();
		System.out.println("Qual o ano atual? ");
		anoAtual = leia.nextInt();
		System.out.println("Qual a data de hoje? ");
		diaAtual = leia.nextInt();
		System.out.println("Que m�s voc� est�?(numeral) ");
		mesAtual = leia.nextInt();
		
		mesesVividos = (anoAtual-anoNascimento)*12+mesNascimento;
		diasVividosIncompleto = mesesVividos*30;
		
		System.out.print("Esses s�o os totais de dias vividos at� hoje: ");
		System.out.println(diasVividosIncompleto);
	}
	
}
