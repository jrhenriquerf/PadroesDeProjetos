package FactoryMethod;

public class Main {

	public static void main(String[] args) {
		FabricaDeAnimais lojaCentro = new LojaCentro();
		lojaCentro.escolherAnimal("FactoryMethod.Gato");
		
		System.out.println(lojaCentro.comprar());
	}

}
