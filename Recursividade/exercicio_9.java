package Recursividade;

public class exercicio_9 {
    
    public static void main(String[] args) {
        
        System.out.println(potencia(5, 2));

    }

    static int potencia(int base, int expoente){

        if(expoente == 0){

            return 1;

        }
        else{

            return (base * potencia(base, expoente - 1));
        
        }

    }

}
