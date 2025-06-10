package Exercitiul5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ItemTracker {
    private Set<Item> items;

    public ItemTracker() {
        this.items = new HashSet<>();
    }

    public boolean addItem(Item item) {
        return items.add(item);
    }

    public boolean removeItem(String id) {
        return items.removeIf(item -> item.getId().equals(id));
    }

    public boolean removeItem2(String id) {
        Iterator<Item> itemsIterator = items.iterator();

        while(itemsIterator.hasNext()) {
            Item item = itemsIterator.next();

            if(item.getId().equals(id)) {
                itemsIterator.remove();
                return true;
            }
        }

        return false;
    }

    public Set<Item> searchItemByName(String name) {
        Set<Item> result = new HashSet<>();
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                result.add(item);
            }
        }

        return result;
    }

    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items to display.");
        } else {
            for(Item item : items) {
                System.out.println(item);
            }
        }
    }
}

