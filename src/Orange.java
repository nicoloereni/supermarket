import java.math.BigDecimal;

public class Orange implements Fruit {

    public static final String ORANGE = "Orange";

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("2.0");
    }

    @Override
    public String getName() {
        return ORANGE;
    }
}
