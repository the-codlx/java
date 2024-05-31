import java.util.Scanner;
import java.io.File;

public class ClasseFile
{
 
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner( System.in );
     
        System.out.print("Entre com um endere�o v�lido de um arquivo: ");
        String caminho = entrada.nextLine();
     
        metodos(caminho);
    }
 
    public static void metodos(String caminho)
    {
        File arquivo = new File(caminho);
     
        if( arquivo.exists() )
        {
            System.out.println("O caminho especificado existe !\nVamos aos testes:\n");
         
            if(arquivo.isAbsolute())
                System.out.println("� um caminho absoluto");
            else
                System.out.println("N�o � um caminho absoluto");
         
            if(arquivo.isFile())
                System.out.printf("� um arquivo de tamanho %s bytes\n"
                        + "�tima vez modificado %s\n"
                        + "Cujo caminho � %s\n"
                        + "De caminho absoluto %s\n"
                        + "E est� no diret�rio pai %s\n",
                        arquivo.length(), arquivo.lastModified(), arquivo.getPath(), arquivo.getAbsolutePath(), arquivo.getParent() );
         
            else
            {
                 System.out.println("� um diret�rio cujo conte�do tem os seguintes arquivos: ");
                 String[] arquivos = arquivo.list();
             
                 for( String file : arquivos)
                   System.out.println( file );
            }
         
        }
        else
                 System.out.println("Endere�o errado");
    }
}