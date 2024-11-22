package factory;

public class Americano implements Coffee{
    @Override
    public void createDrink() {
        System.out.println("готовится Americano");
    }
}
