package Recursividade;

public class exercicio_10 {
    
    public static void main(String[] args) {

        int[] vetor = new int[4];

        vetor[0] = 4;
        vetor[1] = 10;
        vetor[2] = 34;
        vetor[3] = 9;

        System.out.println(maiorElemento(vetor, 0, 0));
        
    }

    static int maiorElemento(int[] vetor, int indice, int maior){

        if(indice == vetor.length){

            return vetor[maior];

        }

        if(vetor[indice] > vetor[maior]){

            maior = indice;
            
        }

        return maiorElemento(vetor, indice + 1, maior);


    }

}
