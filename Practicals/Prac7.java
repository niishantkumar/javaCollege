package javaCollege.Practicals;

public class Prac7 {

    public static void main(String[] args) {
        A ob1 = new A();
        A ob2 = new A();

        Thread t1 = new Thread(ob1, "1st");
        Thread t2 = new Thread(ob2, "2nd");

        t1.setPriority(8);
        t2.setPriority(4); 

        t1.start();
        t2.start();
    }
}

class A implements Runnable {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName()
                + ", Priority: " + Thread.currentThread().getPriority());
    }
}
