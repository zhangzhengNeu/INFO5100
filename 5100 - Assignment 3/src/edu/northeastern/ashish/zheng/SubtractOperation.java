package edu.northeastern.ashish.zheng;

public class SubtractOperation implements MathOperation {
  @Override
  public int performOperation(int num1, int num2) {
    return num1 - num2;
  }
}
