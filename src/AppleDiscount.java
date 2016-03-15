import java.math.BigDecimal;
import java.util.List;

public class AppleDiscount extends DiscountFruit{
    @Override
    public BigDecimal calculateDiscount(List<Fruit> fruits) {
        int applesQuantity = getFruitQuantity(fruits, new Apple());
        return getApplePrice().multiply(new BigDecimal((applesQuantity / 2)));
    }

    private BigDecimal getApplePrice() {
        return new Apple().getPrice();
    }
}
