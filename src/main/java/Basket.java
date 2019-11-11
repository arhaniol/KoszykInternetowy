import java.util.Map;

public class Basket {
    private Map<Item,Integer> orderedItems;

    /**
     * @param item item to add to the basket
     */
    public void addOneItem(Item item){
        if(orderedItems.get(item)>0){
            orderedItems.put(item,orderedItems.get(item)+1);
        }
        else {
            orderedItems.put(item,1);
        }
    }

    /**
     * @param list of items with quantities of them to add
     * @return true if add ok
     */
    public boolean addItems(Map<Item,Integer> list){
        if(list.size()<=0){
            throw new IllegalArgumentException("No elements on the list");
        }
        else {
            orderedItems.putAll(list);
            return true;
        }
    }

    public void substructOneItem(){

    }
}
