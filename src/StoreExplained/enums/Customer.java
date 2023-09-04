package StoreExplained.enums;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private String phoneNo;
    private double walletAmount;
    private Map<Product, Integer> cart = new HashMap<>();

    public Customer() {
    }

    public Customer(String name, String phoneNo, double walletAmount, Map<Product, Integer> cart) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.walletAmount = walletAmount;
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(double walletAmount) {
        this.walletAmount = walletAmount;
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Product, Integer> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", walletAmount=" + walletAmount +
                ", cart=" + cart +
                '}';
    }
}
