package Factory_Method;

public class FabricaSedan extends creatorFabricaDeCarros{

	@Override
	public Carro createCarro() {
		
		return new Sedan();
	}

}
