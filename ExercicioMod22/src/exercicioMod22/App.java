package exercicioMod22;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<String> listaGeral = new ArrayList<>();
		
		while(true) {
			System.out.println("Digite o seu nome e o seu gênero(Exemplo: Gabriel-M ou 'sair' para encerrar: ");
			String  entrada = ler.nextLine();
			
			if(entrada.equalsIgnoreCase("sair")) {
				break;
			} else {
				
				listaGeral.add(entrada);
				
				
				}
			}
		List<String> listaDeMulheres = listaGeral.stream()
				.filter(entrada -> entrada.endsWith("-F"))
				.map(entrada -> entrada.split("-")[0])
				.collect(Collectors.toList());
		
		System.out.println("Mulheres: ");
		listaDeMulheres.forEach(System.out::println);
		}
		

		
	}

