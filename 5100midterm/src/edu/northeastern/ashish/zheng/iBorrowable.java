package edu.northeastern.ashish.zheng;

import java.util.Date;

public interface iBorrowable {

    void setBorrowDate(int day);
    void setReturnDate(int day);
    boolean isAvailable(int day);
}
