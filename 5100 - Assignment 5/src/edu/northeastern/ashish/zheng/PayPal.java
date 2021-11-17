package edu.northeastern.ashish.zheng;

public class PayPal implements PaymentStrategy {
    String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(int num) {
        System.out.println("Paypal : " + "$" + num);
    }
}
