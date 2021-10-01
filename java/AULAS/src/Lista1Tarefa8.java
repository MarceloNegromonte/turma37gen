import java.util.Scanner;

public class Lista1Tarefa8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float custoFabrica, custoConsumidor, impostos, distribuidor;
		
		System.out.println("Digite o custo de fabrica do automovel: ");
		custoFabrica = leia.nextFloat();
		
		impostos = custoFabrica*45/100;
		distribuidor = custoFabrica * 28/100;
		custoConsumidor = custoFabrica+impostos+distribuidor;
		
		System.out.print("O custo ao consumidor é de R$: ");
		System.out.println(custoConsumidor);
		
				
	}
}
