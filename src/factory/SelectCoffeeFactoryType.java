package factory;

public class SelectCoffeeFactoryType {

    public static CoffeeFactory createCoffeeByType(String type) {              // метод для возвращения типа кофе который нам необходим
        if (type.equalsIgnoreCase("americano")) {
            return new AmericanoCoffeeFactory();
        } else if (type.equalsIgnoreCase("espresso")) {
            return new EspressoCoffeeFactory();
        } else {
            throw new RuntimeException(type + "is unknown type");
        }
    }
}
