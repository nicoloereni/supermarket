import java.math.BigDecimal;
import java.util.List;

public class Till {
    public void printTotalCost(List<Fruit> fruits) {

        System.out.println("£" + calculateTotalCost(fruits));

    }

    public BigDecimal calculateTotalCost(List<Fruit> fruits) {
        BigDecimal totalCost = new BigDecimal("0");

        for(Fruit fruit : fruits){
            totalCost = totalCost.add(fruit.getPrice());
        }

        return totalCost;
    }
}
