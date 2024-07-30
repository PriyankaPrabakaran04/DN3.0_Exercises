public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        
        Product p1 = new Product("1", "Product1", 10, 100.0);
        Product p2 = new Product("2", "Product2", 5, 200.0);
        
        manager.addProduct(p1);
        manager.addProduct(p2);
        
        System.out.println("Inventory after adding products:");
        manager.displayInventory();
        
        p1.setPrice(150.0);
        manager.updateProduct(p1);
        
        System.out.println("\nInventory after updating product1's price:");
        manager.displayInventory();
        
        manager.deleteProduct("2");
        
        System.out.println("\nInventory after deleting product2:");
        manager.displayInventory();
    }
}
