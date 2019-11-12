import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Item, Integer> orderedItems = new HashMap<Item, Integer>();

    /**
     * @param item item to add to the basket
     */
    public void addOneItem(Item item) {
        if (orderedItems.size() > 0) {
            if (orderedItems.get(item) != null && orderedItems.get(item) > 0) {
                orderedItems.put(item, orderedItems.get(item) + 1);
            } else {
                orderedItems.put(item, 1);
            }
        } else {
            orderedItems.put(item, 1);
        }
    }

    /**
     * @param list of items with quantities of them to add
     * @return true if add ok
     */
    public boolean addItems(Map<Item, Integer> list) {
        if (list.size() <= 0) {
            throw new IllegalArgumentException("No elements on the list");
        } else {
            orderedItems.putAll(list);
            return true;
        }
    }

    public void removeOneItem() {

    }

    /**
     * @return number of items in basket
     */
    public int getNumberOfItem() {
        int itemCount = 0;
        if (orderedItems.size() > 0) {
            for (Map.Entry<Item, Integer> entry : orderedItems.entrySet()) {
                itemCount += entry.getValue();
            }
        }
        return itemCount;
    }

    /**
     * Printing names of items in basket
     */
    public void showItemInBasket() {
        long count = orderedItems.size();
        if (count > 0) {
            for (Map.Entry<Item, Integer> entry : orderedItems.entrySet()) {
                System.out.println(entry.getKey().getName());
            }

        } else {
            System.out.println("Koszyk jest pusty!");
        }
    }
}

