package StoreExplained;

import StoreExplained.models.Product;
import StoreExplained.models.ProductUsingList;
import StoreExplained.models.Store;

import java.util.List;
import java.util.Map;

public class Main1 {

    public static void main(String[] args) {

        Product p1 = new Product("1","Milk",100.0);
        Product p2 = new Product("2","Tomatoes",120.0);
        Product p3 = new Product("3","Bread",130.0);

        Store store = new Store();

        Map<Product, Integer> storeProducts = store.getListOfProducts();


        System.out.println("**********************MAP IMPLEMENTATION*********************");
//        Using the map
        storeProducts.put(p1, 2);
        storeProducts.put(p2, 10);
        storeProducts.put(p3, 20);



        System.out.println("*****************1**************************");
        System.out.println(storeProducts);
        System.out.println("********************2***********************");

        Integer newQuantity = storeProducts.get(p1);
        System.out.println(newQuantity);


        Main1 m = new Main1();

        System.out.println("*********************3**********************");
        System.out.println(m.customerBuyProductUsingMap(p1,store));
        System.out.println(m.customerBuyProductUsingMap(p1,store));
        System.out.println(m.customerBuyProductUsingMap(p1,store));
        System.out.println("*********************4**********************");
        System.out.println(storeProducts);
        System.out.println("**********************5*********************");




        System.out.println("**********************ARRAY LIST IMPLEMENTATION*********************");
        Store store2 = new Store();
        List<ProductUsingList> storeProductList = store2.getProductList();


        ProductUsingList pl1 = new ProductUsingList("1","Milk",100.0,1);
        ProductUsingList pl2 = new ProductUsingList("2","Tomatoes",120.0,10);
        ProductUsingList pl3 = new ProductUsingList("3","Bread",130.0,2);

        //Using the List
        storeProductList.add(pl1);
        storeProductList.add(pl2);
        storeProductList.add(pl3);

        System.out.println("**********************6*********************");
        System.out.println(storeProductList);
        System.out.println("**********************7*********************");
        System.out.println(m.customerBuysProductUsingArrayList(pl1,store2));
        System.out.println(m.customerBuysProductUsingArrayList(pl1,store2));
        System.out.println("**********************8*********************");
        System.out.println(storeProductList);

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
