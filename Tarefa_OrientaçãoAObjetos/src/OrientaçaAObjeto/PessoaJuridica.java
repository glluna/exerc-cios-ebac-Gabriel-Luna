package OrientaçaAObjeto;

public class PessoaJuridica extends Pessoa {
   private String nome;
   
   private String cpf;
   
   private String empresa;
   
   private String razaosocial;
   
   private String cnpj;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getEmpresa() {
	return empresa;
}

public void setEmpresa(String empresa) {
	this.empresa = empresa;
}

public String getRazaosocial() {
	return razaosocial;
}

public void setRazaosocial(String razaosocial) {
	this.razaosocial = razaosocial;
}

public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}




}
