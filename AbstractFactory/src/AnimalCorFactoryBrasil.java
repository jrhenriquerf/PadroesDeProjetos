public class AnimalCorFactoryBrasil extends AnimalCoresFactory {

	@Override
	public Cor setCor() {
		return new CorVerde();
	}

}
