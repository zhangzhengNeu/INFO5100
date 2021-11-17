package edu.northeastern.ashish.zheng;

public class ShoppingCart {
    int price = 0;
    public ShoppingCart() {
    }
    public void addItem(Item item){
        price = price + item.getPrice();
    }
    public void removeItem(Item item){
        price = price - item.getPrice();
    }
    public int calculateTotal(){
        return price;
    }
    public void pay(PaymentStrategy payMethod){
        payMethod.pay(price);
    }
}
