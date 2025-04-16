package javaCollege.Practicals;

public class Prac6 {

    public static void main(String[] args) {
        A ob1 = new A();
        A ob2 = new A();
        Thread t1 = new Thread(ob1, "1st");
        Thread t2 = new Thread(ob2, "2nd");

        t1.start();
        t2.start();
    }

}

class A implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread());
    }
}