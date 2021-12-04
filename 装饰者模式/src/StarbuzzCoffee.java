public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());


        Beverage housedBlend = new HouseBlend();
        housedBlend = new Soy(housedBlend);
        housedBlend = new Mocha(housedBlend);
        housedBlend = new Whip(housedBlend);
        System.out.println(housedBlend.getDescription() + " $" + housedBlend.cost());
    }
}
