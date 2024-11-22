package factory;

public class Espresso implements Coffee{
    @Override
    public void createDrink() {
        System.out.println("готовится Espresso");
    }
}
