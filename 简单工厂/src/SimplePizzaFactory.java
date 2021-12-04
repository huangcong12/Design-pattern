public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "CheesePizza":
                return new CheesePizza();
            case "VeggiePizza":
                return new VeggiePizza();
            case "ClamPizza":
                return new ClamPizza();
            case "PepperoniPizza":
                return new PepperoniPizza();
        }

        throw new RuntimeException("Unknown pizza type");
    }
}
