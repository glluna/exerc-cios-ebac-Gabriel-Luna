package Coleções;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListNomes {

	public static void main(String[] args) {
		arrayListNomes();
		
	}
	
	public static void arrayListNomes() {
		List<Nomes> lista = new ArrayList<Nomes>();
		
		Nomes a = new Nomes("João Henrique");
		Nomes b = new Nomes("Alex da Silva");
		Nomes c = new Nomes("Ricardo Souza");
		Nomes d = new Nomes("Gabriel Luna");
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		System.out.println("Nomes sem ordem alfabética: "+ lista);
		Collections.sort(lista);
		System.out.println("Nomes em ordem alfabética: "+ lista);
		
		
		
	}

}
