import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
        ProductService service = (ProductService) context.getBean("productService");

        service.addProduct(new Product(1, "Laptop", 75000));
        service.addProduct(new Product(2, "Mouse", 500));
        service.addProduct(new Product(3, "Keyboard", 1500));
        service.addProduct(new Product(4, "Monitor", 12000));

        System.out.println("Products sorted by name:");
        service.getProductsSortedByName().forEach(System.out::println);

        System.out.println("\nProducts sorted by price:");
        service.getProductsSortedByPrice().forEach(System.out::println);
    }
}
