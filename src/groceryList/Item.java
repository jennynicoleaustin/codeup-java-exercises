package groceryList;

public class Item {
    private String name;
    private int num;
    private String category;

    public Item(String name, int num, String category) {
        this.name = name;
        this.num = num;
        this.category = category;
    }

    public String toString () {
        return name + num;

    }
} // item class close
//"The following has been added to your list: " + category + " | " + name + " | " + num;