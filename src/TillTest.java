import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TillTest {

    private ArrayList<Fruit> baseFruit;
    private List<Discount> discounts;

    @Before
    public void setUp() throws Exception {
        baseFruit = new ArrayList();
        baseFruit.add(new Orange());
        baseFruit.add(new Apple());

        discounts = new ArrayList();
        discounts.add(new AppleDiscount());
        discounts.add(new OrangeDiscount());
    }

    @Test
    public void getPriceOfAListOfOrangesAndApples() {

        Till till = new Till(baseFruit, discounts);
        BigDecimal totalCost = till.calculateTotalCost();

        assertNotNull(totalCost);
        assertEquals(new BigDecimal(5).doubleValue(), totalCost.doubleValue());

    }

    @Test
    public void getTwoApplesPayOnlyOne() {

        List<Fruit> fruits = new ArrayList();
        fruits.addAll(baseFruit);
        fruits.add(new Apple());

        Till till = new Till(fruits, discounts);
        BigDecimal totalCost = till.calculateTotalCost();

        assertNotNull(totalCost);
        assertEquals(new BigDecimal(5).doubleValue(), totalCost.doubleValue());

    }

    @Test
    public void getThreeOrangePayOnlyTwo() throws Exception {

        List<Fruit> fruits = new ArrayList();
        fruits.addAll(fruits);
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Apple());

        Till till = new Till(fruits, discounts);
        BigDecimal totalCost = till.calculateTotalCost();

        assertNotNull(totalCost);
        assertEquals(new BigDecimal(7).doubleValue(), totalCost.doubleValue());

    }

}
