package Recursividade;

public class exercicio_5 {
    
    public static void main(String[] args) {
        
        System.out.println(numeroBinario(8));

    }

    static int numeroBinario(int num){

        if(num == 0){

            return 0;

        }

        if(num == 1){

            return 1;
        }

        else{
            return numeroBinario((num / 2) + (num % 2));
        }
        
    }

}
