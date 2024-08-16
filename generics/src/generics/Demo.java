package generics;
import java.util.List;
import java.util.ArrayList;
public class Demo {

	

	public static void main(String[] args) {
		List<Honda> listadeHondas = new ArrayList<>();
		
		listadeHondas.add(new Accord("preto", 2020));
		listadeHondas.add(new Civic("prata", 2023));
		listadeHondas.add(new CRV("branco", 2021));
	
	
	for(Honda honda : listadeHondas) {
		System.out.println(honda);
	}

	}
}
