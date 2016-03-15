import java.math.BigDecimal;
import java.util.List;

public class Till {

    private final DiscountHandler discountHadler;
    private List<Fruit> fruits;

    public Till(List<Fruit> fruits, List<Discount> discounts) {

        this.fruits = fruits;
        this.discountHadler = new DiscountHandler(discounts);

    }

    public void printTotalCost() {

        System.out.println("£" + calculateTotalCost());

    }

    public BigDecimal calculateTotalCost() {
        BigDecimal totalCost = new BigDecimal("0");

        for(Fruit fruit : fruits){
            totalCost = totalCost.add(fruit.getPrice());
        }

        return totalCost.add(discountHadler.calculateDiscounts(fruits).negate());
    }


}
