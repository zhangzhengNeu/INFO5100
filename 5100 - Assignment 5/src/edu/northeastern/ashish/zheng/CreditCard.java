package edu.northeastern.ashish.zheng;

public class CreditCard implements PaymentStrategy {
    String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int num) {
        System.out.println("CreditCard : " + "$" + num);
    }
}
