import java.math.BigDecimal;
import java.util.List;

public class DiscountHandler {

    private List<Discount> discounts;

    public DiscountHandler(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public BigDecimal calculateDiscounts(List<Fruit> fruits) {

        BigDecimal totalDiscount = new BigDecimal(0.0);

        for(Discount discount : discounts){
            totalDiscount = totalDiscount.add(discount.calculateDiscount(fruits));
        }

        return totalDiscount;
    }

}
