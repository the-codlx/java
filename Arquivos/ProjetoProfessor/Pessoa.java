package ProjetoProfessor;
import java.io.Serializable;

public class Pessoa implements Serializable{
	protected String nome;
	protected int idade;

	public Pessoa()
	{
		nome="";
		idade=0;	
	}

	public Pessoa(String nom, int idad)
	{
		this.nome = nom;
		this.idade = idad;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	int getIdade() {
		return idade;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa: nome = " + nome + ", idade = " + idade;
	}

}
