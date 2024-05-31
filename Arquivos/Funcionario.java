public class Funcionario extends Pessoa{
	int matricula;
	String cargo;
	double salario;
	public Funcionario() {
		matricula=0;
		nome = "";
		idade=0;
		cargo="";
		salario = 1500.0;
	}
	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	public Funcionario(int matricula, String nome, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}

	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", nome=" + nome
				+ ", idade=" + idade + ", cargo=" + cargo + ", salario="
				+ salario + "]";
	}
	public void atualizaSalario(double perc)
	{
		salario = salario*(1+perc/100);
	}

}
