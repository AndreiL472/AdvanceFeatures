package Exercitiul5;


import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ItemTracker tracker = new ItemTracker();

        tracker.addItem(new Item("1", "Book"));
        tracker.addItem(new Item("2", "Laptop"));
        tracker.addItem(new Item("3", "Phone"));
        tracker.addItem(new Item("2", "TV"));

        System.out.println("\nAll Items:");
        tracker.displayAllItems();

        System.out.println("\nSearching for 'Laptop':");
        Set<Item> results = tracker.searchItemByName("Laptop");

        for(Item result : results) {
            System.out.println(result);
        }

        System.out.println("\nRemoving item with ID '1': " + (tracker.removeItem("1") ? "Successful" : "Item not found"));

        System.out.println("\nAll Items after removal:");
        tracker.displayAllItems();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu: add | remove | search | display | exit");
            System.out.print("Choose action: ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "add":
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    boolean added = false;

                    if(id != null && !id.isEmpty()) {
                        tracker.addItem(new Item(id, name));
                        added = true;
                    } else {
                        System.out.println("Input not valid. Id and/or name is missing.");
                        break;
                    }

                    System.out.println(added ? "Item added." : "Duplicate ID. Item not added.");

                    break;

                case "remove":
                    System.out.print("Enter ID to remove: ");
                    String removeId = scanner.nextLine();
                    System.out.println(tracker.removeItem(removeId) ? "Item removed." : "Item not found.");
                    break;
                case "search":
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    Set<Item> foundItems = tracker.searchItemByName(searchName);
                    if (foundItems.isEmpty()) {
                        System.out.println("No items found.");
                    } else {
                        foundItems.forEach(s -> System.out.println(s));
                    }
                    break;

                case "display":
                    tracker.displayAllItems();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}

