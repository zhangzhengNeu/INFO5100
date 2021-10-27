package edu.northeastern.ashish.zheng;

public class Reference extends Book{

    private String category ;

    public Reference(String title, double price, String publishYear, String category) {
        super(title, price, publishYear);
        this.category = category;
    }


    @Override
    String description() {
        return "World Maps(title) all information is real.";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
