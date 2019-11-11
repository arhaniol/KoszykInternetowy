
import org.junit.Test;

import static java.lang.Math.abs;
import static org.junit.Assert.*;

public class ItemTest {

    private Item item1=new Item("krzesło",12.3);

    @org.junit.Test
    public void getPriceTestCorrect() {
        assertTrue(abs(item1.getPrice()-12.3)<0.0001);
    }

    @Test
    public void getPriceTestIncorrect(){
        assertFalse(abs(item1.getPrice()-10.1)<0.001);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void setPriceNegative() {
        item1.setPrice(-1.5);
    }

    @Test
    public void setPricePositive(){
        item1.setPrice(2.1);
    }

    @Test
    public void getNameCorrect() {
        assertEquals(item1.getName(), "krzesło");
    }

    @Test
    public void getNameIncorrect(){
        assertNotEquals(item1.getName(),"kolo");
    }

    @Test
    public void setName() {
        item1.setName("kolo");
    }
}