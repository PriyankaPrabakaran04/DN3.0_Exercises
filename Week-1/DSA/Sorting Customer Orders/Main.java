public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "Alice", 250.75),
            new Order("2", "Bob", 120.50),
            new Order("3", "Charlie", 500.00),
            new Order("4", "Diana", 330.20),
            new Order("5", "Eve", 210.40)
        };

        // Bubble Sort
        System.out.println("Bubble Sort:");
        SortAlgorithms.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        orders = new Order[]{
            new Order("1", "Alice", 250.75),
            new Order("2", "Bob", 120.50),
            new Order("3", "Charlie", 500.00),
            new Order("4", "Diana", 330.20),
            new Order("5", "Eve", 210.40)
        };

        System.out.println("\nQuick Sort:");
        SortAlgorithms.quickSort(orders, 0, orders.length - 1);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
