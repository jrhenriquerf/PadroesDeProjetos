package FactoryMethod;

public class LojaCentro extends FabricaDeAnimais{

	@Override
	public void escolherAnimal(String tipo) {
		switch(tipo) {
			case "FactoryMethod.Cavalo":
				animal = new Cavalo();
				break;
			case "FactoryMethod.Cachorro":
				animal = new Cachorro();
				break;
			case "FactoryMethod.Gato":
				animal = new Gato();
				break;
		}
	}
}