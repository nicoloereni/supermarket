import java.math.BigDecimal;
import java.util.List;

public class Till {
    public void printTotalCost(List<Fruit> fruits) {

        System.out.println("£" + calculateTotalCost(fruits));

    }

    public BigDecimal calculateTotalCost(List<Fruit> fruits) {
        BigDecimal totalCost = new BigDecimal("0");
        BigDecimal discount = calculateDiscount(fruits);

        for(Fruit fruit : fruits){
            totalCost = totalCost.add(fruit.getPrice());
        }

        return totalCost.add(discount.negate());
    }

    private BigDecimal calculateDiscount(List<Fruit> fruits) {

        int applesQuantity = getAppleQuantity(fruits);
        return new Apple().getPrice().multiply(new BigDecimal((applesQuantity / 2)));
    }

    public int getAppleQuantity(List<Fruit> fruits) {

        int quantity = 0;

        for(Fruit fruit : fruits){
            if(Apple.APPLE.equals(fruit.getName())){
                quantity ++;
            }
        }

        return quantity;
    }
}
