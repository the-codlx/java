package pilha;

import java.util.Scanner;

import dados.Item;

public class BlocoPrincipalPilhaContig {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println ("digite o tamanho m�ximo da pilha");
		int quant = scan.nextInt();
		//instancia uma nova pilha.
		PilhaContig pilha = new PilhaContig(quant);
		int valor;
		Item item;
		char opcao;
		do {
			opcao = menu();
			switch (opcao){
			case '1':
				System.out.println ("Inserir um Valor na pilha\nDigite um valor");
				valor = scan.nextInt();
				if (! pilha.empilhar(new Item (valor)))
					System.out.println("Pilha est� cheia");
				break;
			case '2':
				item = pilha.desempilhar();
				if (item == null)
					System.out.println("A pilha est� vazia");
				else
					System.out.println(item.getChave());
				break;
			case '3':
				System.out.println("fim do programa");
				break;
			default: 
				System.out.println("op��o inv�lida, tente novamente");
			}
		} while (opcao!='3');
		System.exit(0);
	}
	public static char menu(){
		System.out.println("Escolha uma Op��o:\n" +
				"1. empilhar\n"+
				"2. desempilhar\n"+
				"3. Sair");
		return scan.next().charAt(0);
	}

}
