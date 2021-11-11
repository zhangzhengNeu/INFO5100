package edu.northeastern.ashish.zheng;

public class Main {

  public static final Object obj = new Object();

  public static void main(String[] args) {

    //    LinkList list = new LinkList();
    //
    //    list.addAtPosition(0, 1);
    //    list.addAtPosition(0, 2);
    //    list.addAtPosition(0, 6);
    //    list.addAtPosition(3, 3);
    //    list.removeAtPosition(3, 3);
    //    list.removeAtPosition(2, 1);
    //
    //    list.printList();
    //    System.out.println("last" + list.getLast());
    //    System.out.println("first" + list.getFirst());

    class ArrayAddThread extends Thread {
      @Override
      public void run() {
        LinkList list = new LinkList();
        for (int i = 0; i < 5; i++) {
          list.addAtPosition(0, 1);
          System.out.println("first" + list.getFirst());
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          list.addAtPosition(0, 2);
        }
      }
    }

    class ArrayAddThread2 extends Thread {
      @Override
      public void run() {
        LinkList list = new LinkList();
        for (int i = 0; i < 5; i++) {
          list.addAtPosition(0, 4);
          System.out.println("first" + list.getFirst());
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          list.addAtPosition(0, 2);
        }
      }
    }

    long start3 = System.currentTimeMillis();
    System.out.println(start3);

    ArrayAddThread th1 = new ArrayAddThread();
    th1.start();

    try {
      Thread.sleep(400);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    long start4 = System.currentTimeMillis();
    ArrayAddThread2 th2 = new ArrayAddThread2();
    th2.start();
    System.out.println(start4);

    long start5 = System.currentTimeMillis();
    System.out.println(start5);
  }
}
