package edu.northeastern.ashish.zheng;

//
//class Printer {
//
//    private Printer() {
//    }
//    public static Printer getInstance() {
//    }
//    class Main {
//        public static void main(String[] args) {
//            Printer p1;
//            // refers to the only object of Database
//            p1= Printer.getInstance();
//
//            p1.getConnection();
//        }
//    }
//
//    O/P : Your Printer is working
//
public class Printer {

    private static Printer instance;
    private Printer(){} // No one can create an instance through default constructor

    private static Object obj = new Object();

    public void getConnection(){
        System.out.println("Your Printer is working");
    }
    public static Printer getInstance(){

        if(instance == null){
            synchronized (obj){
                if( instance == null){
                    instance = new Printer();
                }
            }
        }
        return  instance;
    }
    public static void main(String[] args) {
        // write your code here
        Printer p1= Printer.getInstance();
        p1.getConnection();
    }

}


