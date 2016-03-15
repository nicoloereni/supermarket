import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TillTest {

    @Test
    public void getPriceOfAListOfOrangesAndApples(){

        Till till = new Till();

        List<Fruit> fruits = new ArrayList();
        fruits.add(new Orange());
        fruits.add(new Apple());

        BigDecimal totalCost = till.calculateTotalCost(fruits);

        assertNotNull(totalCost);
        assertEquals(new BigDecimal(5).doubleValue(), totalCost.doubleValue());

    }

}
