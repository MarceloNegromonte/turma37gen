package Funcao;

public class TestForEach {

	public static void main(String[] args) {

		String alunos[] = {"MARCOS","MATEUS","PEDRO","JOÃO"};
		
		// FOR PADRÃO
		for (int x=0;x<alunos.length;x++) {
			System.out.println(alunos[x]);
	    }	
	
		//FOR EACH
		for(String nome : alunos) {
			if (nome.equals("Pedro")) {
				break;
			}
			System.out.println(nome);
		}


}	

}
