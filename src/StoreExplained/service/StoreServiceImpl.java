package StoreExplained.service;

import StoreExplained.enums.Staff;
import StoreExplained.enums.Customer;
import StoreExplained.enums.Product;
import StoreExplained.enums.Receipt;

import java.util.List;

public interface StoreServiceImpl {
    List<Product> addProductToStore();
    Receipt sellProductToCustomer(Customer customer, Staff cashier);
}
