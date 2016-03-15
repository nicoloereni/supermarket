import java.math.BigDecimal;
import java.util.List;

public interface Discount {

    BigDecimal calculateDiscount(List<Fruit> fruits);

}
