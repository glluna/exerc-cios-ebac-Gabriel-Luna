package Factory_Method;

public class FabricaSUV extends creatorFabricaDeCarros{

	@Override
	public Carro createCarro() {
		
		return new SUV();
	}

}
