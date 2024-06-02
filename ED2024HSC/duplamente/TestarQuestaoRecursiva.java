package duplamente;
import dados.Item;

public class TestarQuestaoRecursiva {
    
    public static void main(String[] args) {
        
        ListaDupla lista = new ListaDupla();

        lista.inserirUltimo(new Item(2));
        lista.inserirUltimo(new Item(1));
        lista.inserirUltimo(new Item(5));
        lista.inserirUltimo(new Item(10));

        System.out.println(lista.pesquisaRec(5, lista.getPrim()));

    }

}
