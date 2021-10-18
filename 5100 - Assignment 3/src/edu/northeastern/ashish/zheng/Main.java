package edu.northeastern.ashish.zheng;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Psychiatrist psychiatrist = new Psychiatrist();
    Happy happy = new Happy();
    Sad sad = new Sad();
    psychiatrist.examine(happy);
    happy.expressFeelings();
    psychiatrist.observe(happy);
    System.out.println(psychiatrist.toString());

    psychiatrist.examine(sad);
    sad.expressFeelings();
    psychiatrist.observe(sad);
    System.out.println(psychiatrist.toString());

    /*  How are you feeling today?
            I feel happy Today
    heeehee....hahahah...HAHAHA!!
            Observation: Subject laughs a lot

    How are you feeling today?
            I feel sad Today
    ‘waah’  ‘boo hoo’  ‘weep’ ‘sob’
    Observation: Subject cries a lot*/

  }
}
