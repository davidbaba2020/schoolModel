package StoreExplained.service;

import StoreExplained.enums.*;
import StoreExplained.exceptions.InSufficientQuantityException;
import StoreExplained.exceptions.InsufficientFund;
import StoreExplained.exceptions.NotAuthorized;
import StoreExplained.exceptions.ProductNotFound;

import java.io.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class StoreService implements StoreServiceImpl {


    @Override
    public List<Product> addProductToStore() {
        Store store = new Store();
        List<Product> productToReadToStore = store.getProductsInStore();
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
            }
            return productToReadToStore;
        } catch (FileNotFoundException e) {
            System.out.println("File not Found" + e);
        } catch (IOException e) {
            System.out.println("Input or Output error" + e);
        }
        return productToReadToStore;
    }

    @Override
    public Receipt sellProductToCustomer(Customer customer, Staff staff) {
        if(!(staff.getRole().equals(DESIGNATION.CASHIER))) {
            throw new NotAuthorized("You dont have the authorization to sell, get a cashier");
        }
        Store store = new Store();
        Receipt receipt = new Receipt();
        String [] productToBought = new String[customer.getCart().size()];
        AtomicReference<Double> amountOfProductsBought= new AtomicReference<>(0.0);
        List<Product> storeProducts = store.getProductsInStore();
        Map<Product, Integer> customerCart = customer.getCart();

        customerCart.forEach((p, q) -> {
            if(!storeProducts.contains(p)) {
                throw new ProductNotFound("Product not found in Store");
            }
            if(!(p.getQuantity()>=q)) {
              throw new InSufficientQuantityException("Not enough quantity");
            }

            if(!(customer.getWalletAmount()>= p.getPrice()*q)) {
                throw new InsufficientFund("You are broke!");
            }

            storeProducts.remove(p);
            p.setQuantity(p.getQuantity()-q);
            storeProducts.add(p);
            amountOfProductsBought.set(p.getPrice() * q);
            customer.setWalletAmount(customer.getWalletAmount()- amountOfProductsBought.get());

            for (int i=0; i<customer.getCart().size(); i++) {
                productToBought[i] = p.getName();
            }

        });

            receipt.setDateOfPurchase(new Date());
            receipt.setCustomerName(customer.getName());
            receipt.setAmountOfProductsBought(amountOfProductsBought);
            receipt.setProductsBought(productToBought);

        return receipt;
    }


}
