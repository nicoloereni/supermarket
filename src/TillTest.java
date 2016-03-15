import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TillTest {

    private Till till;

    @Before
    public void setUp() throws Exception {
        till = new Till();

    }

    @Test
    public void getPriceOfAListOfOrangesAndApples(){

        List<Fruit> fruits = new ArrayList();
        fruits.add(new Orange());
        fruits.add(new Apple());

        BigDecimal totalCost = till.calculateTotalCost(fruits);

        assertNotNull(totalCost);
        assertEquals(new BigDecimal(5).doubleValue(), totalCost.doubleValue());

    }

    @Test
    public void getTwoApplesPayOnlyOne(){

        List<Fruit> fruits = new ArrayList();
        fruits.add(new Orange());
        fruits.add(new Apple());
        fruits.add(new Apple());

        BigDecimal totalCost = till.calculateTotalCost(fruits);

        assertNotNull(totalCost);
        assertEquals(new BigDecimal(5).doubleValue(), totalCost.doubleValue());

    }

    @Test
    public void getThreeOrangePayOnlyTwo() throws Exception {

        List<Fruit> fruits = new ArrayList();
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Orange());
        fruits.add(new Apple());
        fruits.add(new Apple());

        BigDecimal totalCost = till.calculateTotalCost(fruits);

        assertNotNull(totalCost);
        assertEquals(new BigDecimal(7).doubleValue(), totalCost.doubleValue());

    }

    @Test
    public void getAppleQuantity() throws Exception {

        List<Fruit> fruits = new ArrayList();
        fruits.add(new Orange());
        fruits.add(new Apple());
        fruits.add(new Apple());

        assertEquals(2, till.getFruitQuantity(fruits, new Apple().getName()));

    }
}
