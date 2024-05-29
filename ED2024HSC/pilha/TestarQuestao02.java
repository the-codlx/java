package pilha;

import dados.Item;

public class TestarQuestao02 {

	public static void main(String[] args) {
		PilhaContig pilha = new PilhaContig(5);
		pilha.empilhar(new Item(17));
		pilha.empilhar(new Item(5));
		pilha.empilhar(new Item(2));
		pilha.empilhar(new Item(10));
		pilha.empilhar(new Item(15));
		
		//pilha.retirarMaior10();
		
		//verificar o metodo acima
		while (!pilha.eVazia()) {
			System.out.println(pilha.desempilhar().getChave());
		}
	
	}

}
