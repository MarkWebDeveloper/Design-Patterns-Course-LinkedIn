package dev.mark.java_design_patterns.iterator;

public class PancakeHouseMenu implements Menu {
    MenuItem[] menuItems;
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    
    public PancakeHouseMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    
    public Iterator<MenuItem> createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    
    public String toString() {
        return "Objectville Pancake House Menu";
    }
}
