package edu.northeastern.ashish.zheng;

public class NonFiction extends Book implements iBorrowable {

    private int borrowDate = 0;
    private int returnDate = 0;

    public NonFiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public void setBorrowDate(int day) {
        borrowDate = day;

    }

    @Override
    public void setReturnDate(int day) {
        returnDate = day;

    }

    @Override
    public boolean isAvailable(int day) {
        if(borrowDate <= day && day <= returnDate){
            return false;
        }
        return true;
    }

    @Override
    String description() {
        return "Anne Frank(title) all events are true and based on real facts.";
    }
}
