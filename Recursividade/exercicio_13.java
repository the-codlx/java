package Recursividade;

public class exercicio_13 {
    
    public static void main(String[] args) {
    
        System.out.println(calcularMDC(10, 5));

    }

    static int calcularMDC(int a, int b){

        if(a == b){

            return b;

        }

        else{

            return calcularMDC(b, a - b);

        }
    }

}
