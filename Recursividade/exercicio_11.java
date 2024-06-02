package Recursividade;

public class exercicio_11 {
    
    public static void main(String[] args) {
        
        System.out.println(fibonacci(3));

    }

    static int fibonacci(int num){

        if(num < 2){

            return 1;
        
        }
        else{
            
            return fibonacci(num - 1) + fibonacci(num - 2);
        
        }

    }

}
