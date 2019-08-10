public class Main {

	public static void main(String[] args) {
		/* Animal Brasil  */
        FabricaAnimal animalBrasil = new FabricaAnimalBrasil();
        pizzariaCentro.criarPizza("centro", "frango");
        Pizza pizza = pizzariaCentro.delivery();

        /* Animal �frica */
        FabricaAnimal animalAfrica = new FabricaPizzaAfrica();
        pizzariaOeste.criarPizza("oeste", "calabresa");
        pizza = pizzariaOeste.delivery();
	}

}
