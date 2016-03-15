import java.math.BigDecimal;
import java.util.List;

public class OrangeDiscount extends DiscountFruit{
    @Override
    public BigDecimal calculateDiscount(List<Fruit> fruits) {
        int orangesQuantity = getFruitQuantity(fruits, new Orange());
        return getOrangePrice().multiply(new BigDecimal((orangesQuantity / 3)));
    }

    private BigDecimal getOrangePrice() {
        return new Orange().getPrice();
    }
}
