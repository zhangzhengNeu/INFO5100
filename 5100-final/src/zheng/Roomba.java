package zheng;

import java.util.Arrays;

public class Roomba implements iRobot{
    int[][] room;
    Direction dir;
    int[] curIndex;


    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Roomba(int[][] room){
        this.room = room;
        dir = Direction.DOWN;
        curIndex = new int[]{0,0};
    }


    @Override
    public boolean move() {
        if(dir == Direction.DOWN){
            int[] nextIndex = new int[]{curIndex[0] + 1,curIndex[1]};
            System.out.println(Arrays.toString(nextIndex));
            if(nextIndex[0] >= 0 && nextIndex[0] < room.length && nextIndex[1] >= 0 && nextIndex[1] < room[0].length
                    && (room[nextIndex[0]][nextIndex[1]] != -1)){
                curIndex = nextIndex;
                return true;
            }else{
                return false;
            }
        }
        else if(dir == Direction.RIGHT){
            int[] nextIndex = new int[]{curIndex[0],curIndex[1] + 1};
            if(nextIndex[0] >= 0 && nextIndex[0] < room.length && nextIndex[1] >= 0 && nextIndex[1] < room[0].length
                    && (room[nextIndex[0]][nextIndex[1]] != -1)){
                curIndex = nextIndex;
                return true;
            }else{
                return false;
            }
        }
        else if(dir == Direction.LEFT){
            int[] nextIndex = new int[]{curIndex[0],curIndex[1] - 1};
            if(nextIndex[0] >= 0 && nextIndex[0] < room.length && nextIndex[1] >= 0 && nextIndex[1] < room[0].length
                    && (room[nextIndex[0]][nextIndex[1]] != -1)){
                curIndex = nextIndex;
                return true;
            }else{
                return false;
            }
        }
        else{
            int[] nextIndex = new int[]{curIndex[0] - 1,curIndex[1]};
            if(nextIndex[0] >= 0 && nextIndex[0] < room.length && nextIndex[1] >=0 && nextIndex[1] < room[0].length
                    && (room[nextIndex[0]][nextIndex[1]] != -1)){
                curIndex = nextIndex;
                return true;
            }else{
                return false;
            }
        }
    }



    @Override
    public void turnLeft() {
        if( dir == Direction.LEFT){
            dir = Direction.DOWN;
        } else if (dir == Direction.RIGHT){
            dir = Direction.UP;
        }else if (dir == Direction.UP){
            dir = Direction.LEFT;
        }else if (dir == Direction.DOWN){
            dir = Direction.RIGHT;
        }
    }

    @Override
    public void turnRight() {
        if( dir == Direction.LEFT){
            dir = Direction.UP;
        } else if (dir == Direction.RIGHT){
            dir = Direction.DOWN;
        }else if (dir == Direction.UP){
            dir = Direction.RIGHT;
        }else if (dir == Direction.DOWN){
            dir = Direction.LEFT;
        }
    }

    @Override
    public void clean() {
        if(room[curIndex[0]][curIndex[1]] == 1){
            return;
        } else if(room[curIndex[0]][curIndex[1]] == 0){
            room[curIndex[0]][curIndex[1]] = 1;
            return;
        }
    }
}
