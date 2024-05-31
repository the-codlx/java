import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AlterarArqAleatorio {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner ler = new Scanner(System.in);
		Professor professor = new Professor();
		int matricula,matProf,cont=0;
		long n=0;
		
		int tamReg = 3*2*30+4+2*10; //3 Strings de tamanho 30 (cada caractere possui tamanho de 2 bytes)
		//1 int para matr�cula com tamamnho de 4 bytes
		//1 String de tamanho 10
		//<matr�cula>;<nome>;<endere�o>;<data-ingresso>;<setor>
		//C:\\Users\\rober.marcone\\Documents\\Java\\
		RandomAccessFile arqProfessor = new RandomAccessFile("professor.dat", "rw");
		boolean encontrou=false;
		n = (arqProfessor.length() / tamReg); // calcula o n�mero de registros do arquivo (sizefile)

		if(n!=0) //testar se existem registros no arquivo
		{
			System.out.printf("Informe a matr�cula do professor que os dados ser�o atualizados, -1 para encerrar:\n");
			matProf=Integer.parseInt(ler.nextLine());

			while (matProf!=-1) {
				while(arqProfessor.readInt() != matProf && cont<=n)
				{
					cont++;
					arqProfessor.seek(tamReg*(cont)); // posiciona o ponteiro de posi��o no pr�ximo registro do arquivo
				}
				if( cont<=n)
				{
					// leitura dos novos dados do registro a ser alterado
					System.out.printf("Informe o nome do professor:\n");
					professor.setNome(ler.nextLine());
					System.out.printf("Informe o endere�o do professor:\n");
					professor.setEndereco(ler.nextLine());
					System.out.printf("\nInforme a data de ingresso do professor: ");
					professor.setData(ler.nextLine());
					System.out.printf("Informe o setor do professor: ");
					professor.setSetor(ler.nextLine());
					arqProfessor.seek(tamReg*(cont)); // posiciona o ponteiro de posi��o no registro do arquivo a ser alterado
					arqProfessor.writeInt(matProf);
					gravarString(arqProfessor, professor.getNome(), 30);
					gravarString(arqProfessor, professor.getEndereco(), 30);
					gravarString(arqProfessor, professor.getData(), 10);
					gravarString(arqProfessor, professor.getSetor(), 30);
				}
				else
				{
					System.out.println("Professor de matr�cula "+matProf+" n�o foi encontrado!");
				}
				// posiciona o ponteiro no in�cio do arquivo
				arqProfessor.seek(0);
				cont=0;

				System.out.printf("Informe a matr�cula do professor que os dados ser�o atualizados, -1 para encerrar:\n");
				matProf=Integer.parseInt(ler.nextLine());
				//			n = n + 1;
				//			System.out.printf("\n");
			}
		}
		else
		{
			System.out.println("Arquivo vazio! Fim do programa!");
		}
		arqProfessor.close();
	}
	private static String lerString(RandomAccessFile arq, int tam) throws IOException {
		char result[] = new char[tam];
		for (int i=0; i<tam; i++) {
			result[i] = arq.readChar();
		}
		return(new String(result).replace('\0', ' '));
	}
	private static void gravarString(RandomAccessFile arq, String s, int tam) throws IOException {
		StringBuilder result = new StringBuilder(s);
		result.setLength(tam);
		arq.writeChars(result.toString());
	}
}