package Recursividade;

public class exercicio_4 {
    
    public static void main(String[] args) {
        
        String palavra = "Paralelepipedo";

        System.out.println(quantCaracteres(palavra, 'e'));

        }

        static int quantCaracteres(String palavra, char caracter){

            if(palavra.isEmpty()){

                return 0;

            }

            if (palavra.charAt(0) == caracter) {

                return 1 + quantCaracteres(palavra.substring(1), caracter);

            }
            else{

                return quantCaracteres(palavra.substring(1), caracter);
            }      
            
    }

}
