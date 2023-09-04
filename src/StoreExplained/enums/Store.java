package StoreExplained.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Store {
    private Map<Product, Integer> listOfProducts = new HashMap<>();
    private List<ProductUsingList> productList = new ArrayList<>();
    private static List<Product> productsInStore = new ArrayList<>();


    public Store() {
    }

    public Store(Map<Product, Integer> listOfProducts, List<ProductUsingList> productList, List<Product> productsInStore) {
        this.listOfProducts = listOfProducts;
        this.productList = productList;
        this.productsInStore = productsInStore;
    }

    public Map<Product, Integer> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(Map<Product, Integer> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public List<ProductUsingList> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductUsingList> productList) {
        this.productList = productList;
    }

    public List<Product> getProductsInStore() {
        return productsInStore;
    }

    public void setProductsInStore(List<Product> productsInStore) {
        this.productsInStore = productsInStore;
    }


}
