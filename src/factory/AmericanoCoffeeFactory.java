package factory;

public class AmericanoCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}
