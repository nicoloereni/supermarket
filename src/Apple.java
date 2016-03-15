import java.math.BigDecimal;

public class Apple implements Fruit {

    public static final String APPLE = "apple";

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("3.0");
    }

    @Override
    public String getName() {
        return APPLE;
    }
}
