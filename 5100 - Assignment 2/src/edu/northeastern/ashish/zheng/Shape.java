package edu.northeastern.ashish.zheng;

/** @author zheng */

/*
shape1
the Shape1 has a pink color
shape2
area : 30 perimeter : 20
the Shape2 has a orange color
rectangle1
area : 4 perimeter : 8
rectangle2
area : 28 perimeter : 22
the Rectangle has a Purple color
square1
area : 9 perimeter : 12
square2
area : 49 perimeter : 28
the Square has a black color
*/

public class Shape {
  private String name;
  private String color;
  private int area;
  private int perimeter;

  public Shape(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public Shape(String name, String color, int perimeter, int area) {
    this.name = name;
    this.color = color;
    this.area = area;
    this.perimeter = perimeter;
  }

  public Shape() {}

  public String printShape() {
    return "the " + name + " has a " + color + " color";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getArea() {
    return area;
  }

  public void setArea(int area) {
    this.area = area;
  }

  public int getPerimeter() {
    return perimeter;
  }

  public void setPerimeter(int perimeter) {
    this.perimeter = perimeter;
  }
}
