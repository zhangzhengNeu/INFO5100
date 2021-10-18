package edu.northeastern.ashish.zheng;

public class Happy extends Moody {
    @Override
    String getMood() {
        return "I feel happy Today";
    }

    @Override
    void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}
