package Recursividade;

public class exercicio {

    public static void main(String[] args) {
        
        int[] vetor = new int[4];

        vetor[0] = 2;
        vetor[1] = 3;
        vetor[2] = 5;
        vetor[3] = 10;

        System.out.println(calcularValores(vetor, 0, 0));
    }

    static int calcularValores(int[] vetor, int indice, int soma){

        if(indice == vetor.length){
            return soma;
        }

        else{
            return calcularValores(vetor, indice + 1, soma + vetor[indice]);
        }

    }
    
}
