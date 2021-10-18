package edu.northeastern.ashish.zheng;

public class Psychiatrist {
    String observation;
    public void examine(Moody object){
        System.out.println("How are you feeling today?");
        object.queryMood();
    }


    public void observe(Moody object){
        observation = object.toString();
//        System.out.println("Observation: "  + object.toString());

    }

    @Override
    public String toString() {
        return "Observation: " + observation;
    }
}
