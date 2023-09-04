package StoreExplained.enums;

import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

public class Receipt {
    private Date dateOfPurchase;
    private String customerName;
//    private Map<String, Integer> productsBought;
    private String[] productsBought;
    private AtomicReference<Double> amountOfProductsBought;

    public Receipt() {
    }

    public Receipt(Date dateOfPurchase, String customerName, String[] productsBought, AtomicReference<Double> amountOfProductsBought) {
        this.dateOfPurchase = dateOfPurchase;
        this.customerName = customerName;
        this.productsBought = productsBought;
        this.amountOfProductsBought = amountOfProductsBought;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String[] getProductsBought() {
        return productsBought;
    }

    public void setProductsBought(String[] productsBought) {
        this.productsBought = productsBought;
    }

    public AtomicReference<Double> getAmountOfProductsBought() {
        return amountOfProductsBought;
    }

    public void setAmountOfProductsBought(AtomicReference<Double> amountOfProductsBought) {
        this.amountOfProductsBought = amountOfProductsBought;
    }

    @Override
    public String toString() {
        return "Receipt[" +
                "********* "+customerName+" *********"+'\n'+
                "dateOfPurchase=" + dateOfPurchase +'\n'+
                "customerName='" + customerName + '\'' +'\n'+
                "productsBought=" + Arrays.toString(productsBought) +'\n'+
                "amountOfProductsBought=" + amountOfProductsBought +'\n'+
                "********* Thanks For Patronizing Us"+
                ']';
    }
}
