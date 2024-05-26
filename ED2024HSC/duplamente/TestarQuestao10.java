package duplamente;

import dados.Item;

public class TestarQuestao10 {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
		
		lista.inserirUltimo(new Item(0));
		lista.inserirUltimo(new Item(0));
		lista.inserirUltimo(new Item(1));
		lista.inserirUltimo(new Item(0));
		
		if (lista.removerZeros()){
			System.out.println("Todos os zeros foram removidos");
			
		}else {
			System.out.println("a lista está vazia ou não tem zeros");
		}

		System.out.println("conteúdo da lista:\n"+lista.toString());
	}

}
