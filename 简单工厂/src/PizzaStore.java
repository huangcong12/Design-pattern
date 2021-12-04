public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.factory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
