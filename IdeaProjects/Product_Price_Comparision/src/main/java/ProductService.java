
import java.util.*;

public class ProductService {
    private Map<Integer, Product> productMap = new HashMap<>();

    public void addProduct(Product product) {
        productMap.put(product.getId(), product);
    }

    public List<Product> getProductsSortedByName() {
        List<Product> products = new ArrayList<>(productMap.values());
        products.sort(Comparator.comparing(Product::getName));
        return products;
    }

    public Set<Product> getProductsSortedByPrice() {
        return new TreeSet<>((p1, p2) -> {
            int priceCompare = Double.compare(p1.getPrice(), p2.getPrice());
            return priceCompare != 0 ? priceCompare : Integer.compare(p1.getId(), p2.getId());
        }) {{
            addAll(productMap.values());
        }};
    }
}
