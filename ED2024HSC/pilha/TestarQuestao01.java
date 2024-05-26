package pilha;

public class TestarQuestao01 {

	public static void main(String[] args) {
		String palavra = "dados";
		PilhaContigChar pilha = new PilhaContigChar(palavra.length());
		palavra = pilha.inverterPalavra(palavra);
		System.out.println("palavra invertida: "+palavra);
	}

}
