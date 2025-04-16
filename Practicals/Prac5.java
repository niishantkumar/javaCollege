package javaCollege.Practicals;

public class Prac5 {
    public static void main(String[] args) {
        A ob = new A();
        Thread t = new Thread(ob);
        t.start();

    }
}

class A implements Runnable {
    public void run() {
        System.out.println("Hiii");
    }
}
