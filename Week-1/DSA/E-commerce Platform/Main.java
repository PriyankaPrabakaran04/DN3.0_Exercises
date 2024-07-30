import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("3", "Product3", "Category1"),
            new Product("1", "Product1", "Category2"),
            new Product("2", "Product2", "Category1")
        };

        // Linear search
        Product foundProduct = SearchAlgorithms.linearSearch(products, "2");
        System.out.println("Linear Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));

        // Sort the array for binary search
        Arrays.sort(products, Comparator.comparing(Product::getProductId));

        // Binary search
        foundProduct = SearchAlgorithms.binarySearch(products, "2");
        System.out.println("Binary Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));
    }
}
