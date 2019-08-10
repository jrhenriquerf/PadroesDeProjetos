public class FabricaAnimalBrasil extends FabricaAnimal {
	
	@Override
	public void pegarAnimal(String continente, String tipo) {
		switch(tipo) {
			case "Cachorro":
				animal = new Cachorro(getCores(continente));
				break;	
			case "Gato":
				animal = new Gato(getCores(continente));
				break;
			case "Peixe":
				animal = new Peixe(getCores(continente));
				break;
			case "Papagaio":
				animal = new Papagaio(getCores(continente));
				break;
		}
	}
}
