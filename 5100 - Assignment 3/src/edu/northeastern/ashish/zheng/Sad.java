package edu.northeastern.ashish.zheng;

public class Sad extends Moody {
    @Override
    String getMood() {
        return "I feel sad Today";
    }

    @Override
    void expressFeelings() {
        System.out.println("‘waah’  ‘boo hoo’  ‘weep’ ‘sob’");
    }

    @Override
    public String toString() {
        return "Subject cries a lot";
    }
}