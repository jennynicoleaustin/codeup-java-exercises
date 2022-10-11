package groceryList;

import java.util.HashMap;

public class Item {
    private String name;
    private int num;
    private String category;
    private HashMap<Integer, String> categories = new HashMap<>();

    private void setCategories() {
        categories.put(1, "meat");
        categories.put(2, "dairy");
        categories.put(3, "frozen");
        categories.put(4, "produce");
        categories.put(5, "bakery");
        categories.put(6, "pantry");
        categories.put(7, "other");
    }

    public String getCategory(int catNum) {
        this.category = categories.get(catNum);
        return category;
    }

    public Item(String name, int num, int catNum) {
        this.name = name;
        this.num = num;
        this.category = getCategory(catNum);
    }

  public Item(){
        this.name = "testName";
        this.num = 2;
        this.category = "testcat";
  }
}
