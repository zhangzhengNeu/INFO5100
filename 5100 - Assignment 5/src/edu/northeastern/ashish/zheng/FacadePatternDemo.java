package edu.northeastern.ashish.zheng;

    public class FacadePatternDemo {
        public static void main(String[] args) {
            ShapeMaker shapeMaker = new ShapeMaker();

            shapeMaker.drawCircle();
            shapeMaker.drawRectangle();
            shapeMaker.drawSquare();
        }
    }
