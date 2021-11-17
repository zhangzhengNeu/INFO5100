package edu.northeastern.ashish.zheng;

public class Item extends ShoppingCart {

    private String id;
    private int price;

    public Item(String id, int price) {
        this.id = id;
        this.price = price;
    }


    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
