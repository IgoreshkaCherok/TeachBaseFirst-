package moduleFive.product;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Список продуктов
        List<Product> products = Arrays.asList(
                new Product("Product1", 10.0, 3),
                new Product("Product2", 20.0, 2),
                new Product("Product3", 5.0, 5)
        );

        // Вычисление общей стоимости продуктов
        double totalCost = products.stream()
                .mapToDouble(product -> product.getPrice() * product.getQuantity())
                .sum();

        System.out.println("Общая стоимость продуктов: " + totalCost);
    }
}
