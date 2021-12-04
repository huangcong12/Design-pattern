public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("什么都不会，不会叫");
    }
}
