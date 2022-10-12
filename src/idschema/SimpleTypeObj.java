package idschema;

public class SimpleTypeObj {
    public boolean uniqueItems;
    public boolean additionalItems;
    public String type;
    public Items items;
    public SimpleTypeObj(){

    }

    public SimpleTypeObj(boolean uniqueItems, boolean additionalItems, String type, Items items) {
        this.uniqueItems = uniqueItems;
        this.additionalItems = additionalItems;
        this.type = type;
        this.items = items;
    }

    public boolean isUniqueItems() {
        return uniqueItems;
    }

    public boolean isAdditionalItems() {
        return additionalItems;
    }

    public String getType() {
        return type;
    }

    public Items getItems() {
        return items;
    }
}
