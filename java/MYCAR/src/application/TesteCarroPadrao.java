package application;

import java.util.Scanner;

import entities.Carro;

public class TesteCarroPadrao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Carro carro1 = new Carro("PLX-0301","CELTA","GM");
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro2.setPlaca("BBC-0301");
		carro2.setModelo("UNO");
		carro1.setPlaca("PPR-0234");
	
		/*como ler e colocar a variavel no set.
		System.out.println("Digite a placa");
		String auxPlaca = leia.next();
		carro3.setPlaca(auxPlaca);
		*/
		//teste metodo
		System.out.println(carro1.getPlaca()+" "+carro1.getModelo());
		System.out.println(carro2.getPlaca()+" "+carro2.getModelo());
		
	}

}
