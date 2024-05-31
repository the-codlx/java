package ProjetoProfessor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LerArqAleatorio{

	public static void main(String[] args) throws IOException {
		Professor professor = new Professor();

		try {
			int tamReg = 3*2*30+4+2*10; //3 Strings de tamanho 30 (cada caractere possui tamanho de 2 bytes)
			//1 int para matr�cula com tamamnho de 4 bytes
			//1 String de tamanho 10
			//<matr�cula>;<nome>;<endere�o>;<data-ingresso>;<setor>
			//C:\\Users\\rober.marcone\\Documents\\Java\\
			RandomAccessFile arqProfessor = new RandomAccessFile("professor.dat", "rw");

			System.out.printf("Reg Matr Nome.......................... Endere�o...................... Data...... Setor.........................\n");
			System.out.printf("-------------------------------------------------------------------------------------------------------------------------------\n");
			int i;
			long n = (arqProfessor.length() / tamReg); // calcula o n�mero de registros do arquivo (sizefile)
			for (i=1; i<=n; i++) {
				professor.setMatricula(arqProfessor.readInt());
				professor.setNome(lerString(arqProfessor, 30));
				professor.setEndereco(lerString(arqProfessor, 30));
				professor.setData(lerString(arqProfessor, 10));
				professor.setSetor(lerString(arqProfessor, 30));
				System.out.printf("%3d %d %30s %30s %10s %30s \n", i, professor.getMatricula(), professor.getNome(), professor.getEndereco(), professor.getData(), professor.getSetor());
			}
			System.out.printf("-------------------------------------------------------------------------------------------------------------------------------\n");
			arqProfessor.close();
		} catch (FileNotFoundException e) {
			System.err.printf("Arquivo n�o encontrado: %s.\n", e.getMessage());
		}
	}

	private static String lerString(RandomAccessFile arq, int tam) throws IOException {
		char result[] = new char[tam];
		for (int i=0; i<tam; i++) {
			result[i] = arq.readChar();
		}
		return(new String(result).replace('\0', ' '));
	}
}
