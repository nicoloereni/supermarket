import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class DiscountHandlerTest {

    private DiscountHandler discountHandler;
    private ArrayList baseFruit;

    @Before
    public void setUp() throws Exception {

        List<Discount> discounts = new ArrayList<Discount>();
        discounts.add(new AppleDiscount());
        discounts.add(new OrangeDiscount());

        discountHandler = new DiscountHandler(discounts);

        baseFruit = new ArrayList();
        baseFruit.add(new Orange());
        baseFruit.add(new Apple());
    }

    @Test
    public void calculatDiscountsReturnZeroIfDiscountsNotFound(){
        BigDecimal discount = discountHandler.calculateDiscounts(baseFruit);

        assertNotNull(discount);
        assertEquals(new BigDecimal(0.0).doubleValue(), discount.doubleValue());
    }

    @Test
    public void calculateDiscountsReturnTheTotalDiscountForTheFruitPassed() {

        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.addAll(baseFruit);
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Apple());
        fruits.add(new Apple());

        BigDecimal discount = discountHandler.calculateDiscounts(fruits);

        assertNotNull(discount);
        assertEquals(new BigDecimal(5.0).doubleValue(), discount.doubleValue());

    }

}
