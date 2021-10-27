package edu.northeastern.ashish.zheng;

public class Fiction extends Book implements iBorrowable {

    private int borrowDate = 0;
    private int returnDate = 0;

    @Override
    String description() {
        return "Frankenstein(title) all events are imaginary and not based on real facts";
    }

    public Fiction(String title, double price, String publishYear) {

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

}
