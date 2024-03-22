package Br.com.luna;
import java.util.Scanner;
public class ColeçõesParte2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Quantas pessoas deseja separar?");
		int totalPessoas = ler.nextInt();
		
		String[] Masculino = new String[totalPessoas];
		String[] Feminino = new String[totalPessoas];
		
		int countMasculino = 0;
		int countFeminino = 0;
		
		for (int i = 0; i < totalPessoas; i++) {
			System.out.println("Digite o nome e o sexo da pessoa"+ (i + 1)+"(Exemplo: Gabriel-M , Beatriz-F");
			String entrada = ler.nextLine();
			
			String[] partes = entrada.split("-");
			if(partes.length == 2) {
				
				String nome = partes[0];
				
				String sexo = partes[1];
				
				if(sexo.equalsIgnoreCase("M")) {
					Masculino[countMasculino++] = nome;
				}else if(sexo.equalsIgnoreCase("F")) {
					Feminino[countFeminino++] = nome;
				}else {
					System.out.println("Sexo inválido. Digite 'M' para masculino ou 'F' para feminino.");
					
				}
			}
			System.out.println("\nPessoas do sexo Masculino: ");
			for (int i1 = 0; i1 < countMasculino; i1++) {
				System.out.println(Masculino[i1]);
			}
			
			System.out.println("\nPessoas do sexo Feminino: ");
			for (int i1 = 0; i1 < countFeminino; i1++) {
				System.out.println(Feminino[i1]);
			}
			
		}
		

	}

}
