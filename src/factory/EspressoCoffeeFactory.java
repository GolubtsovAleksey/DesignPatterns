package factory;

public class EspressoCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}
