public abstract class FabricaAnimal {
	protected Animal animal;
	
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
	
	private AnimalCoresFactory getCores(String continente) {
		if(continente.equals("Africano")) {
			return new AnimalCorFactoryAfrica();
		}
		return new AnimalCorFactoryBrasil(); 
	}
	
	public Animal pegar() {
		return animal;
	}
}
