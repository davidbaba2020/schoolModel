package StoreExplained.service;

import StoreExplained.enus.CATEGORY;
import StoreExplained.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StoreService implements StoreServiceImpl {


    @Override
    public List<Product> addProductToStore() {
        List<Product> productToReadToStore = new ArrayList<>();
//        File file = new File("./src/main/resources/store_productList.csv");
        File file = new File("src/resources/product.csv");
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                if (row.length == 5 && !row[0].equalsIgnoreCase("id")) {
                    Product newProduct = new Product();
                    newProduct.setId(row[0]);
                    newProduct.setName(row[1]);
                    newProduct.setCategory(CATEGORY.valueOf(row[2]));
                    newProduct.setPrice(Double.parseDouble(row[3]));
                    newProduct.setQuantity(Integer.parseInt(row[4]));
                    productToReadToStore.add(newProduct);
                }
            }            return productToReadToStore;
        } catch (FileNotFoundException e) {
            System.out.println("File not Found" + e);
        } catch (IOException e) {
            System.out.println("Input or Output error" + e);
        }
        return productToReadToStore;
    }

}
