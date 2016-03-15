import java.math.BigDecimal;

public class Apple implements Fruit {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("3.0");
    }
}
