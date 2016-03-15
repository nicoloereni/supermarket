import java.util.List;

public abstract class DiscountFruit implements Discount{

    protected int getFruitQuantity(List<Fruit> fruits, Fruit fruitToFind) {

        int quantity = 0;

        for(Fruit fruit : fruits){
            if(fruitToFind.getName().equals(fruit.getName())){
                quantity ++;
            }
        }

        return quantity;
    }

}
