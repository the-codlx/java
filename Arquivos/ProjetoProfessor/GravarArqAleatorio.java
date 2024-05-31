package ProjetoProfessor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.Scanner;

public class GravarArqAleatorio {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner ler = new Scanner(System.in);
		Professor professor = new Professor();
		long n;
		//Date data_ingresso;
		int tamReg = 3*2*30+4+2*10; //3 Strings de tamanho 30 (cada caractere possui tamanho de 2 bytes)
		//1 int para matr�cula com tamamnho de 4 bytes
		//1 String de tamanho 10
		//<matr�cula>;<nome>;<endere�o>;<data-ingresso>;<setor>
		//C:\\Users\\WizeComp\\Documents\Faesa\LP II\Arquivo
		//C:\\Users\\rober.marcone\\Documents\\Java\\
		RandomAccessFile arqProfessor = new RandomAccessFile("professor.dat", "rw");
		int matricula;
		arqProfessor.seek(arqProfessor.length()); // posiciona o ponteiro de posi��o no final do arquivo
		n = (arqProfessor.length() / tamReg) + 1; // n�mero do novo registro

		System.out.printf("Informe a matr�cula do professor, -1 para encerrar:\n");
		matricula=Integer.parseInt(ler.nextLine());

		while (matricula!=-1) {
			System.out.printf("%do. registro-------------------------------\n", n);
			professor.setMatricula(matricula);
			System.out.printf("Informe o nome do professor:\n");
			professor.setNome(ler.nextLine());
			System.out.printf("Informe o endere�o do professor:\n");
			professor.setEndereco(ler.nextLine());
			System.out.printf("\nInforme a data de ingresso do professor: ");
			professor.setData(ler.nextLine());
			System.out.printf("Informe o setor do professor: ");
			professor.setSetor(ler.nextLine());


			arqProfessor.writeInt(matricula);
			gravarString(arqProfessor, professor.getNome(), 30);
			gravarString(arqProfessor, professor.getEndereco(), 30);
			gravarString(arqProfessor, professor.getData(), 10);
			gravarString(arqProfessor, professor.getSetor(), 30);

			n = n + 1;

			System.out.printf("\n");
			System.out.printf("Informe a matr�cula do professor, -1 para encerrar:\n");
			matricula=Integer.parseInt(ler.nextLine());          
		}
		arqProfessor.close();
		ler.close();
	}

	private static void gravarString(RandomAccessFile arq, String s, int tam) throws IOException {
		StringBuilder result = new StringBuilder(s);
		result.setLength(tam);
		arq.writeChars(result.toString());
	}
}