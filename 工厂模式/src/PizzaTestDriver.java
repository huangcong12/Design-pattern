public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NyStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

        Pizza nyPizza = nyStylePizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyPizza.getName() + "\n");

        Pizza chicagoPizza = chicagoStylePizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + chicagoPizza.getName() + "\n");
    }
}
