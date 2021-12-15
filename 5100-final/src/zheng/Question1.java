package zheng;

import java.util.HashSet;

public class Question1 {

    int[][] room;
    Roomba.Direction dir;
    int[] curIndex;

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void main(String[] args) {
        int[] curIndex2 = new int[]{0,0};
//        enum dir = Direction.DOWN;
        int[][] room = new int[][] {{1,1,0,0},{0,-1,0,0},{1,1,0,0},{0,0,0,0}};
        Roomba ss = new Roomba(room);
        ss.move();
//        ss.turnLeft();
//        System.out.println(ss.dir);
        System.out.println(ss.move());

    }
}