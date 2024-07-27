package Factory_Method;

public class Demo {

	public static void main(String[] args) {
		creatorFabricaDeCarros fabricaSedan = new FabricaSedan();
		Carro sedan = fabricaSedan.createCarro();
		sedan.ExibirInfo();

		creatorFabricaDeCarros FabricaSUV = new FabricaSUV();
		Carro suv = FabricaSUV.createCarro();
		suv.ExibirInfo();
	}

}
