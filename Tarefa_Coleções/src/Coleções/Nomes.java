package Coleções;

public class Nomes implements Comparable<Nomes> {
	private String nome;

	public Nomes(String nome) {
		this.nome = nome;
	}

	public String getNomes() {
		return nome;
	}

	public void setNomes(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return " nomes=" + nome;
	}

	@Override
	public int compareTo(Nomes nome) {
		return this.nome.compareTo(nome.getNomes());
	}
	
	
	
	

}
