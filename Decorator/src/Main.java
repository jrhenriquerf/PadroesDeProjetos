public class Main {

    public static void main(String[] args) {
        Comida burgerDecorado = new DecoradorBurger(new BurgerSimples());
        burgerDecorado.fazer();
    }
}
