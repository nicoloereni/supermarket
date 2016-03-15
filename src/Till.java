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

        return totalCost.add(calculateDiscounts(fruits).negate());
    }

    private BigDecimal calculateDiscounts(List<Fruit> fruits) {
        return calculateAppleDiscount(fruits).add(calculateOrangeDiscount(fruits));
    }

    private BigDecimal calculateOrangeDiscount(List<Fruit> fruits) {
        int orangesQuantity = getFruitQuantity(fruits, new Orange());
        return new Orange().getPrice().multiply(new BigDecimal((orangesQuantity / 3)));
    }


    private BigDecimal calculateAppleDiscount(List<Fruit> fruits) {
        int applesQuantity = getFruitQuantity(fruits, new Apple());
        return new Apple().getPrice().multiply(new BigDecimal((applesQuantity / 2)));
    }


    public int getFruitQuantity(List<Fruit> fruits, Fruit fruitToFind) {

        int quantity = 0;

        for(Fruit fruit : fruits){
            if(fruitToFind.getName().equals(fruit.getName())){
                quantity ++;
            }
        }

        return quantity;
    }
}
