public class DecoradorBurger extends Burger {
    public DecoradorBurger(Comida burgerDecorado) {
        super(burgerDecorado);
    }

    public void fazer() {
        this.implementarIngredientes();
        burgerDecorado.fazer();
        System.out.println("Ingredientes: " + this.ingredientes);
    }

    private void implementarIngredientes() {
        this.ingredientes.add(new Queijo());
        this.ingredientes.add(new Bacon());
    }
}
