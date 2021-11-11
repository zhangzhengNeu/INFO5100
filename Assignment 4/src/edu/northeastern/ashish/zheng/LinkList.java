package edu.northeastern.ashish.zheng;

public class LinkList {

  //  @Override
  //  public void run() {
  //    while (true) {
  //      new LinkList();
  //    }
  //  }

  public Node head;
  public Node tail;

  public LinkList() {
    synchronized (Main.obj) {
      head = null;
      tail = null;
    }
  }

  public int getFirst() {
    synchronized (Main.obj) {
      return head.data;
    }
  }

  public int getLast() {
    synchronized (Main.obj) {
      return tail.data;
    }
  }

  public void addAtPosition(int index, int element) {

    synchronized (Main.obj) {
      int size = this.size();

      if (index > size && index < 0) {
        System.out.println("index out of bounds");
      }
      Node node = new Node(element);

      if (head == null && index == 0) {
        head = node;
        tail = node;
      } else if (index == 0) {
        Node second = head;
        head = node;
        head.next = second;
        //      tail = second;
      } else if (index == size) {
        tail.next = node;
        tail = node;
      } else {
        Node pointer = head;
        while (index - 1 > 0) {
          pointer = pointer.next;
          index--;
        }
        Node nextNode = pointer.next;
        pointer.next = node;
        node.next = nextNode;
      }
    }
  }

  public void removeAtPosition(int index, int element) {
    synchronized (Main.obj) {
      int size = this.size();
      if (index > size - 1 && index < 0) {
        System.out.println("index out of bounds");
      }

      if (index == 0) {
        if (head == null) {
          return;
        }
        if (head != null && head.next == null) {
          head = null;
          tail = null;
        }
        if (head != null && head.next != null) {
          if (element == head.data) {
            Node nextNode = head.next;
            head = nextNode;
          }
        }
      } else if (index == size - 1) {
        Node pointer = head;
        while (index - 1 > 0) {
          pointer = pointer.next;
          index--;
        }
        if (element == pointer.next.data) {
          pointer.next = null;
          tail = pointer;
        }
      } else {
        Node pointer = head;
        while (index - 1 > 0) {
          pointer = pointer.next;
          index--;
        }
        if (element == pointer.next.data) {
          pointer.next = pointer.next.next;
        }
      }
    }
  }

  public int size() {
    synchronized (Main.obj) {
      if (head == null) {
        return 0;
      }
      int count = 0;
      Node temp = head;
      while (temp != null) {
        count++;
        temp = temp.next;
      }
      return count;
    }
  }

  public void printList() {
    synchronized (Main.obj) {
      Node temp = head;

      while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
      }
      System.out.println();
    }
  }
}
