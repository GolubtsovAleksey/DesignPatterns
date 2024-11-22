import adapter.OldCardMemory;
import adapter.USB;
import adapter.USBAdapterToOldCardMemory;
import adapter.MyComp;
import factory.Coffee;
import factory.CoffeeFactory;
import proxy.DataSource;
import proxy.PostgresDataSource;
import proxy.ProxyPostgresDataSources;
import singleton.SingletonLogg;

import static factory.SelectCoffeeFactoryType.createCoffeeByType;

public class Main {
    public static void main(String[] args) {

        SingletonLogg.getInstance().classLogg("str1", "str2");             // - Singelton
        SingletonLogg.getInstance().classLogg(123, "str2");
        System.out.println();

        CoffeeFactory coffeeFactory1 = createCoffeeByType("americano");                // - Factory
        Coffee coffee1 = coffeeFactory1.createCoffee();
        coffee1.createDrink();
        CoffeeFactory coffeeFactory2 = createCoffeeByType("espresso");
        Coffee coffee2 = coffeeFactory2.createCoffee();
        coffee2.createDrink();
        System.out.println();

        MyComp myComp = new MyComp();
        USB usb = new USBAdapterToOldCardMemory(new OldCardMemory());                // - Adapter
        myComp.setUsb(usb);
        myComp.workWithUsb();
        System.out.println();

        DataSource dataSource = new ProxyPostgresDataSources(new PostgresDataSource());
        System.out.println(dataSource.getName());

    }
}