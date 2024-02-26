package Coleções;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class ArrayList2parte {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	List<String> listaDeHomens = new ArrayList<>();
	List<String> listaDeMulheres = new ArrayList<>();
	
	while(true) {
		System.out.println("Digite um nome e gênero (Exemplo: Gabriel-M ou 'sair' para encerrar: ");
		String entrada = ler.nextLine();
		
		if(entrada.equalsIgnoreCase("sair")) {
			
			break;
		} else {
			
			String[] partes = entrada.split("-");
			
			if (partes.length == 2) {
				
				String nome = partes[0];
				
				String genero = partes[1];
				
				if (genero.equalsIgnoreCase("M")) {
					
					listaDeHomens.add(nome);
				}else if(genero.equalsIgnoreCase("F")) {
					listaDeMulheres.add(nome);
				}else {
					System.out.println("Sexo inválido! Digite M para masculino ou F para Feminino.");
				}
			}
		}
		
	}
	
	System.out.println("Homens: ");
	for (String genero : listaDeHomens) {
	    System.out.println(genero);
	}
	
	System.out.println("Mulheres: ");
	for (String genero : listaDeMulheres) {
		System.out.println(genero);
	}
	
}
	
}
