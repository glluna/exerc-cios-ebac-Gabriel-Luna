package Br.com.Luna;

public class ControleDeFluxo {

	public static void main(String[] args) {
		double nota1 = 7.0;
		
		double nota2 = 5.0;
		
		double nota3 = 6.0;
				
		double nota4 = 7.0;
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println(media);
		
	    if(media >= 7.0 && media <= 10.0) {
	    	System.out.println("Parabéns! Você foi aprovado.");
	    }else if(media >= 5.0 && media < 7.0) {
	    	System.out.println("Você está em recuperação! Estude mais que você consegue.");
	    }else if(media < 5.0 && media >= 0) {
	    	System.out.println("Que pena! Você foi reprovado :/");
	    }else {
	    	System.out.println("Notas inválidas...");
	    }
	}

}
