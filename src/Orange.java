import java.math.BigDecimal;

public class Orange implements Fruit {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("2.0");
    }
}
