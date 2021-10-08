package Lista6;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Nino",6);
		Cavalo cavalo = new Cavalo("Flash",5);
		Preguica preguica = new Preguica("Plegui",3);
		
		System.out.println("Nome do Cachorro: "+cachorro.getNome()+" de idade: "+cachorro.getIdade());
		System.out.println("Nome do Cavalo: "+cavalo.getNome()+" de idade: "+cavalo.getIdade());
		System.out.println("Nome do Preguiça: "+preguica.getNome()+" de idade: "+preguica.getIdade());
	
		System.out.print("Cachorro ");
		cachorro.correr();
		System.out.print("Cachorro ");
		cachorro.emitirSom();
		
		System.out.print("Cavalo ");
		cavalo.correr();
		System.out.print("Cavalo ");
		cavalo.emitirSom();
		
		System.out.print("Preguiça ");
		preguica.correr();
		System.out.print("Preguica ");
		preguica.subirArvores();
		
	
	}

}
