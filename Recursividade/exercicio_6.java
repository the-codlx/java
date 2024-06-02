package Recursividade;
import duplamente.*;
import dados.Item;

public class exercicio_6 {

    public static void main(String[] args) {
        
        ListaDupla lista = new ListaDupla();

        lista.inserirUltimo(new Item(3));
        lista.inserirUltimo(new Item(6));
        lista.inserirUltimo(new Item(9));
        lista.inserirUltimo(new Item(12));
        lista.inserirUltimo(new Item(15));

        System.out.println(lista.pesquisaRec(2, lista.getPrim()));

    }   
    
    static boolean pesquisaRec(int chave, NoDupla atual){

		if(atual == null){

			return false;

		}

		if(atual.getInfo().getChave() == chave){

			return true;

		}	

		else{

			return pesquisaRec(chave, atual.getProx());

		}
		
	}
    
}
