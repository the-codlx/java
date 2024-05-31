
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;
public class LeGravaArquivoTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor = new Professor();
		PrintWriter arquivoProfessorW = null;
		Scanner ler= new Scanner(System.in);
		int matricula;

		try 
		{
			FileWriter out = new FileWriter("professores.txt", true); 
			arquivoProfessorW = new PrintWriter(out);
			System.out.printf("Informe a matr�cula do professor, -1 para encerrar:\n");
			matricula=Integer.parseInt(ler.nextLine());

			while (matricula!=-1) {
				professor.setMatricula(matricula);
				System.out.printf("Informe o nome do professor:\n");
				professor.setNome(ler.nextLine());
				System.out.printf("Informe o endere�o do professor:\n");
				professor.setEndereco(ler.nextLine());
				System.out.printf("\nInforme a data de ingresso do professor: ");
				professor.setData(ler.nextLine());
				System.out.printf("Informe o setor do professor: ");
				professor.setSetor(ler.nextLine());
				arquivoProfessorW.println(professor.getMatricula()+"-"+professor.getNome()+"-"+professor.getEndereco()+
						"-"+professor.getData()+"-"+professor.getSetor());

				System.out.printf("Informe a matr�cula do professor, -1 para encerrar:\n");
				matricula=Integer.parseInt(ler.nextLine());          
			}
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivoProfessorW.close();
		}
		
		String linha;
		Scanner arquivoProfessorR = null;
		try {
			FileReader in = new FileReader("professores.txt");
			arquivoProfessorR = new Scanner(in);

			while(arquivoProfessorR.hasNext())			
			{
				//faz algo com a linha
				linha = arquivoProfessorR.nextLine();
				String[] valorComSplit = linha.split("-");

				for(String s : valorComSplit){
					System.out.print(s.trim()+"\t");
				}
				System.out.print("\n");
			}
		} catch (Exception e) { 
			System.out.println(e);
		} finally { 
			arquivoProfessorR.close();
		}
		ler.close();
	}
}