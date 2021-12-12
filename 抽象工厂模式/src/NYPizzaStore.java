public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            // TODO
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
