public class TestDriver {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);
        pizzaStore.orderPizza("CheesePizza");
        pizzaStore.orderPizza("ClamPizza");
        pizzaStore.orderPizza("PepperoniPizza");
        pizzaStore.orderPizza("Unknown pizza type");
    }
}
