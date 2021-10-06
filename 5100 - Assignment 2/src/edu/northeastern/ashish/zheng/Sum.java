package edu.northeastern.ashish.zheng;

public class Sum {
  /*Q2) Create a Sum class with methods to get desired output. Use the below function to test the
  output.
  public static void main(String[] args){
      Sum sum = new Sum();
      System.out.println(sum.add(2, 3)); //output : 5
      System.out.println(sum.add(4, 9, 12));//output : 25
      System.out.println(sum.add(4, 5.0));//output : 9.0
      System.out.println(sum.add(15.5, 5));//output : 20.5
      System.out.println(sum.add(1.0, 6.4));//output : 7.4*/

  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int add(int n1, int n2, int n3) {
    return n1 + n2 + n3;
  }

  public double add(int n1, double n2) {
    return n1 + n2;
  }

  public double add(double n1, int n2) {
    return n1 + n2;
  }

  public double add(double n1, double n2) {
    return n1 + n2;
  }
}
