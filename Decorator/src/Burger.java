public abstract class Burger extends Comida {
    protected Comida burgerDecorado;

    Burger(Comida burgerDecorado) {
        this.burgerDecorado = burgerDecorado;
    }
}
