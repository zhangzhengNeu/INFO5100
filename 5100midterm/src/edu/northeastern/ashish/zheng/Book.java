package edu.northeastern.ashish.zheng;

public abstract class Book {
    private String title;
    private double price;
    private String publishYear;

    abstract String description();

    public Book(String title, double price, String publishYear) {
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }


}
