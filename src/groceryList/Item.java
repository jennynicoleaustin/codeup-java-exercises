package groceryList;

public class Item {
    private String name;
    private int numItem;

    private String category;

    public Item(String name, int numItem, String category) {
        this.name = name;
        this.numItem = numItem;
        this.category = category;

    }

    public String getName() {
        return name;
    }

    public int getNumItem() {
        return numItem;
    }

    public String getCategory() {
        return category;
    }

    public String toString () {
        return name + " | " + numItem;

    }
} // item class close
