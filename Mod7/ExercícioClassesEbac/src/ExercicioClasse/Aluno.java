package ExercicioClasse;

public class Aluno {
	//Atributos da classe Aluno
	private String nome;
	private int idade;
	private String cpf;
	
public Aluno(String nome, int idade, String cpf) {
	//O método construtor da classe Aluno inicializa os atributos do objeto.
	this.nome = nome;
	this.idade = idade;
	this.cpf = cpf;
}

//Os métodos getters servem para pegar os valores dos atributos do objeto Aluno e os métodos setters para atribuir valores a esses atributos privados.
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}



	
	

}
