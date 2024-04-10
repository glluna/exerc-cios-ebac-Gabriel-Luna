package OrientaçaAObjeto;

public class Programa {

	public static void main(String[] args) {
		PessoaFisica pessoafisica = new PessoaFisica();
		pessoafisica.setNome("Gabriel Luna");
		pessoafisica.setCpf("00000000099");
		pessoafisica.setRG("0000009");
		imprimir(pessoafisica);
		
		PessoaJuridica pessoajuridica = new PessoaJuridica();
		pessoajuridica.setNome("Daniel Cerqueira");
		pessoajuridica.setCpf("00000000088");
		pessoajuridica.setCnpj("10000000/0001-00");
		pessoajuridica.setEmpresa("Docerqueira");
		pessoajuridica.setRazaosocial("Vender doces e salgados");
		imprimir(pessoajuridica);
     
	}
	
	public static void imprimir(PessoaFisica pessoafisica) {
		System.out.println("Dados da pessoa fisica { "+" Nome: " + pessoafisica.getNome() +" , CPF: " + pessoafisica.getCpf() + " , RG: "+  pessoafisica.getRG()+ " }");
	}
	
	public static void imprimir(PessoaJuridica pessoajuridica) {
		System.out.println("Dados da pessoa juridica { " +" Nome: "+ pessoajuridica.getNome()+ " , CPF: " + pessoajuridica.getCpf() + " , CNPJ: " + pessoajuridica.getCnpj() + " , Empresa: " + pessoajuridica.getEmpresa() + " , Razão social: " + pessoajuridica.getRazaosocial() + " }");
	}

}
