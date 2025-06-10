package Exercitiul5;

import java.util.Objects;

public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;

        Item item = (Item) o;
        if (this.name.equals(item.getName()) && id.equals(item.id)) return true;

        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;

        Item item = (Item) o;
        return id.equals(item.id);
    }

/*    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Item{id='" + id + "', name='" + name + "'}";
    }
}

