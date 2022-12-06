package DZ13Reflection_API;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Item implements MyMarkerInterface {

//    private static final long serialVersionUID = 475918891428093041L;
    private Long id;
    private String name;
    private transient Double itemCostPrice;

    public Item(Long itemId, String itemName, Double itemCostPrice) {
        super();
        this.id = itemId;
        this.name = itemName;
        this.itemCostPrice = itemCostPrice;
    }

    public Long getItemId() {
        return id;
    }

    @Override
    public String toString() {
        return "Item [itemId=" + id + ", itemName=" + name + ", itemCostPrice=" + itemCostPrice + "]";
    }


    public void setItemId(Long itemId) {
        this.id = itemId;
    }

    public String getItemName() {
        return name;
    }

    public void setItemName(String itemName) {
        this.name = itemName;
    }

    public Double getItemCostPrice() {
        return itemCostPrice;
    }

    public void setItemCostPrice(Double itemCostPrice) {
        this.itemCostPrice = itemCostPrice;
    }

    public Map<String, Object> serialize() throws Exception {
        Map<String, Object> fields = new HashMap<String, Object>();
        for (Field f : Item.class.getDeclaredFields())
            fields.put(f.getName(), f.get(this));
        return fields;
    }
}
 interface MyMarkerInterface {

}