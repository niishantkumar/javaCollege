package javaCollege.lecture;

//use of this keyword to call another constructor

public class Prac7 {

    public static void main(String[] args) {
        A ob = new A();

    }

}

class A {
    A() {
        this(10);
        System.out.println("hiii");

    }

    A(int a) {
        System.out.println(a);
    }
}