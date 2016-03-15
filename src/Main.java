import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Till till = new Till();

        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Orange());
        fruits.add(new Apple());

        till.printTotalCost(fruits);

    }
}
