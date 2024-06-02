package Recursividade;
import filaCircular.*;
import dados.Item;


public class exercicio_12 {
    
    public static void main(String[] args) {
        
        
        FilaCircular fila = new FilaCircular(4);
    
        FilaCircular aux = new FilaCircular(fila.getTamanho());

        FilaCircular fila2 = new FilaCircular(fila.getTamanho());
    
        fila.enfileirar(new Item(400));
        fila.enfileirar(new Item(0));
        fila.enfileirar(new Item(80));
        fila.enfileirar(new Item(16));
    
        //clonar(fila, aux);
        
        System.out.println(maioresDe70(fila, fila2));

    }

    static FilaCircular clonar(FilaCircular fila, FilaCircular filaClone){

		for(int i = 0; i < fila.getTamanho(); i++){

			Item info = fila.desenfileirar();
			filaClone.enfileirar(info);
			fila.enfileirar(info);

		}

		return filaClone;

	}

    static FilaCircular maioresDe70(FilaCircular fila, FilaCircular fila2){

		if(fila.getTamanho() == 0){

			return fila2;

		}

        Item item = fila.desenfileirar();

		if(item.getChave()  >= 70){

			fila2.enfileirar(item);

		}

		return maioresDe70(fila, fila2); 
	
	}

}
