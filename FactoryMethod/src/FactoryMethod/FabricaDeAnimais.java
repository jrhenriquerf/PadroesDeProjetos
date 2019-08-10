package FactoryMethod;

public abstract class FabricaDeAnimais {
	protected Animal animal;
	
	public abstract void escolherAnimal(String tipo);
	
	public Animal comprar() {
		return animal;
	}
}