package dev.mark.java_design_patterns.iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public PancakeHouseMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
    
}
