import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    Basket basket = new Basket();
    Item item1 = new Item("pen", 6.5),
            item2 = new Item("sheet", 0.2),
            item3 = new Item("cap", 3.25);

    @Test
    public void addOneItemTest() {
        basket.addOneItem(item1);
        assertEquals(1, basket.getNumberOfItem());
    }

    @Test
    public void addFewItemsTest() {
        basket.addOneItem(item1);
        basket.addOneItem(item2);
        basket.addOneItem(item3);

        assertEquals(3, basket.getNumberOfItem());
    }

    @Test
    public void addFewSameItemsTest() {
        basket.addOneItem(item2);
        basket.addOneItem(item2);
        assertEquals(2, basket.getNumberOfItem());
    }

    @Test
    public void addItemsTest() {
    }

    @Test
    public void removeOneItemTest() {
    }

    @Test
    public void getNumberOfItemTest() {
    }

    @Test
    public void showItemInBasketTest() {
    }
}