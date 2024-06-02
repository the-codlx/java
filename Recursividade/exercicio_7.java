package Recursividade;

public class exercicio_7 {
    public static void main(String[] args) {
        
    }

    static boolean pesquisaBinaria(int num, int[] vetor){

        if(vetor[vetor.length / 2] > num){

            return pesquisaBinaria(num, vetor);

        }

        if(vetor.length == 1){

            return true;
        }
        else{ 

        }
        return true;
    }

}
