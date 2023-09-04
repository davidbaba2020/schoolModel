package StoreExplained;

import StoreExplained.enums.*;
import StoreExplained.service.StoreService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {

    public static void main(String[] args) {

        Product p1 = new Product("1","FOOD", CATEGORY.FOOD,100.0,30);
        Product p2 = new Product("2","Tomatoes",CATEGORY.FOOD,120.0,12);
        Product p3 = new Product("3","Bread",CATEGORY.FOOD,130.0,7);
        Product p4 = new Product("4","T-shirt",CATEGORY.CLOTHES,1330.0,3);

        Store store = new Store();
//
//        Map<Product, Integer> storeProducts = store.getListOfProducts();
//
//
//        System.out.println("**********************MAP IMPLEMENTATION*********************");
////        Using the map
//        storeProducts.put(p1, 2);
//        storeProducts.put(p2, 10);
//        storeProducts.put(p3, 20);
//
//
//
//        System.out.println("*****************1**************************");
//        System.out.println(storeProducts);
//        System.out.println("********************2***********************");
//
//        Integer newQuantity = storeProducts.get(p1);
//        System.out.println(newQuantity);
//
//
//        Main1 m = new Main1();
//
//        System.out.println("*********************3**********************");
//        System.out.println(m.customerBuyProductUsingMap(p1,store));
//        System.out.println(m.customerBuyProductUsingMap(p1,store));
//        System.out.println(m.customerBuyProductUsingMap(p1,store));
//        System.out.println("*********************4**********************");
//        System.out.println(storeProducts);
//        System.out.println("**********************5*********************");
//
//
//
//
//        System.out.println("**********************ARRAY LIST IMPLEMENTATION*********************");
//        Store store2 = new Store();
//        List<ProductUsingList> storeProductList = store2.getProductList();
//
//
//        ProductUsingList pl1 = new ProductUsingList("1","Milk",100.0,1);
//        ProductUsingList pl2 = new ProductUsingList("2","Tomatoes",120.0,10);
//        ProductUsingList pl3 = new ProductUsingList("3","Bread",130.0,2);
//
//        //Using the List
//        storeProductList.add(pl1);
//        storeProductList.add(pl2);
//        storeProductList.add(pl3);
//
//        System.out.println("**********************6*********************");
//        System.out.println(storeProductList);
//        System.out.println("**********************7*********************");
//        System.out.println(m.customerBuysProductUsingArrayList(pl1,store2));
//        System.out.println(m.customerBuysProductUsingArrayList(pl1,store2));
//        System.out.println("**********************8*********************");
//        System.out.println(storeProductList);
//


        System.out.println("********************************************************CLASS 2 BEGINS HERE********************************************************N");
        System.out.println("********************************************************CLASS 2 BEGINS HERE********************************************************N");

//        StoreService store3 = new StoreService();
//        System.out.println(store3.addProductToStore());
//        System.out.println(store3.addProductToStore().size());

        StoreService storeProdFromFile = new StoreService();
        List<Product> productFromFile = storeProdFromFile.addProductToStore();

        List<Product> productsFromTheStore = store.getProductsInStore();
        productsFromTheStore.add(p1);
        productsFromTheStore.add(p2);
        productsFromTheStore.add(p3);
        productsFromTheStore.add(p4);

        System.out.println(productsFromTheStore);
        System.out.println(productsFromTheStore.size());


//        productFromFile.add(p1);
//        productFromFile.add(p2);

        System.out.println("**********************Read From Store*********************");
        System.out.println(productFromFile);
        System.out.println(productFromFile.size());

        System.out.println("********************************************************");
        System.out.println("********************************************************");
        System.out.println("********************************************************");

        Customer cust1 = new Customer();
        Map<Product,Integer> customerCartItems = new HashMap<>();
        customerCartItems.put(p1,3);
        customerCartItems.put(p2,5);

        cust1.setWalletAmount(100000.34);
        cust1.setName("David");
        cust1.setPhoneNo("097667890t76");
        cust1.setCart(customerCartItems);

//        Staff staff1 = new Staff("Bill",DESIGNATION.MANAGER,0);
        Staff staff1 = new Staff("Bill",DESIGNATION.CASHIER,0);

//        storeProdFromFile.sellProductToCustomer(cust1,staff1);
        System.out.println(storeProdFromFile.sellProductToCustomer(cust1,staff1));
        System.out.println(productFromFile);
        System.out.println(cust1.getWalletAmount());

    }







    public String customerBuyProductUsingMap(Product product, Store store) {
            Map<Product, Integer> storeProducts = store.getListOfProducts();
            int newQuantity = storeProducts.get(product);
            if(storeProducts.containsKey(product)) {
                if(newQuantity<=0) {
                    return "Product out of stock";
                }
                newQuantity = newQuantity-1;
                storeProducts.replace(product,newQuantity);
            }
            return "Product bought successfully, products remaining: "+newQuantity;
        }


        public String customerBuysProductUsingArrayList (ProductUsingList product, Store store) {
            List<ProductUsingList> productList = store.getProductList();
            if(!productList.contains(product)) {
                return "Product not in store";
            }
            if(product.getQuantity()<=0) {
                return "Product out of stock";
            }
            product.setQuantity(product.getQuantity()-1);
            productList.remove(product);
            productList.add(product);
            return "Product bought successfully";
        }

}
