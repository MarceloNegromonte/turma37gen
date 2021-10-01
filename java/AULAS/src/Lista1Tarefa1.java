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
		System.out.println("Qual o ano que você nasceu? ");
		anoNascimento = leia.nextInt();
		System.out.println("Qual mês você nasceu? ");
		mesNascimento = leia.nextInt();
		System.out.println("Qual dia você nasceu? ");
		diaNascimento = leia.nextInt();
		System.out.println("Qual o ano atual? ");
		anoAtual = leia.nextInt();
		System.out.println("Qual a data de hoje? ");
		diaAtual = leia.nextInt();
		System.out.println("Que mês você está?(numeral) ");
		mesAtual = leia.nextInt();
		
		mesesVividos = (anoAtual-anoNascimento)*12+mesNascimento;
		diasVividosIncompleto = mesesVividos*30;
		
		System.out.print("Esses são os totais de dias vividos até hoje: ");
		System.out.println(diasVividosIncompleto);
	}
	
}
