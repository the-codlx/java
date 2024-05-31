package ProjetoProfessor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaArqSerializavel {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);

		String nome;
		String cargo;
		double salario;


		// 1) desserializa��o: recuperando os objetos gravados no arquivo bin�rio "dados.dat" 

		ArrayList<Object> funcionario = ArqSerializavel.lerArquivoBinario("dados.dat");

		// 2) entrada de dados 
		while (true) { 
			System.out.printf("Ficha nro: %d.\n", (funcionario.size()+1));
			System.out.printf("Informe o nome da pessoa, FIM para encerrar:\n"); 
			nome = ler.nextLine(); 
			if (nome.equalsIgnoreCase("FIM")) break;

			System.out.printf("\nInforme o cargo da pessoa:"); 
			cargo = ler.nextLine();
			System.out.printf("Informe o sal�rio da pessoa: "); 
			salario = ler.nextDouble();
			funcionario.add(new Funcionario(nome, cargo, salario)); // adiciona um novo objeto a lista
			ler.nextLine(); // esvazia o buffer do teclado System.out.printf("\n"); }

			// 3) serializa��o: gravando o objeto no arquivo bin�rio "dados.dat"
			ArqSerializavel.gravarArquivoBinario(funcionario, "dados.dat");
		}

		// desserializa��o: recuperando os objetos gravados no arquivo bin�rio "dados.dat"
		funcionario = ArqSerializavel.lerArquivoBinario("dados.dat");

		int i = 1;
		for (Object item: funcionario) {
			System.out.printf("Ficha nro....: %d.\n", i++);
			// ((Pessoa)item) - implementa o mecanismo de downcast, ou seja,
			//                  o objeto "item" declarado a partir da classe
			//                  base "Object" � referenciado como um objeto "Pessoa"
			System.out.printf("Nome.........: %s\n", ((Funcionario)item).getNome());
			System.out.printf("Cargo........: %s\n", ((Funcionario)item).getCargo());
			System.out.printf("Sal�rio......: %.2f reais\n", ((Funcionario)item).getSalario());
		}
	}
}