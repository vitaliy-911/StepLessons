package HomeWork.GroceryItem;

import java.util.List;

public class Customer {
    private final String name;
    private final List<GroceryItem> shoppingList;

    public Customer(String name, List<GroceryItem> shoppingList) {
        this.name = name;
        this.shoppingList = shoppingList;
    }

    public List<GroceryItem> getShoppingList() {
        return shoppingList;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + shoppingList;

    }
}
