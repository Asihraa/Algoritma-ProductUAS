package soalno3;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ProductModel productModel = new ProductModel();
            List<Product> products = productModel.fetchProducts();

            System.out.println("Data sebelum diurutkan:");
            for (Product product : products) {
                System.out.println(product);
            }

            SelectionShort.sort(products);

            System.out.println("\nData setelah diurutkan berdasarkan rating:");
            for (Product product : products) {
                System.out.println(product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}