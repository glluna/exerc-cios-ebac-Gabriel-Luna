package generics;

public class Civic extends Honda{
	private String cor;
	private int ano;	

	

	public Civic(String cor, int ano) {
		this.cor = cor;
		this.ano = ano;
	}
	
	



	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}





	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}





	/**
	 * @return the ano
	 */
	public int getAno() {
		return ano;
	}





	/**
	 * @param ano the ano to set
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}





	@Override
	public void ExibirInfo() {
		System.out.println("Este é um Honda modelo Civic de cor: "+ cor + "ano: "+ ano);
	}
    
    
}

