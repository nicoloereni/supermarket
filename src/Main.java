import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Apple());
        fruits.add(new Apple());
        fruits.add(new Apple());
        fruits.add(new Apple());

        List<Discount> discounts = new ArrayList<Discount>();
        discounts.add(new AppleDiscount());
        discounts.add(new OrangeDiscount());

        Till till = new Till(fruits, discounts);

        till.printTotalCost();

    }
}
