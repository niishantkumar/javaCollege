package javaCollege.lecture;

//constructors

public class prac1 {

    public static void main(String[] args) {
        A ob = new A();
        A ob1 = new A(100);
        A ob2 = new A(200, 300);
        A ob3 = new A(ob2);

        ob.show();
        ob1.show();
        ob2.show();
        ob3.show();
    }
}

class A {
    int x, y;

    A() {          //non-parameterized
        x = 10;
        y = 20;
    }

    A(int p) {          //parameterized
        x = y = p;
    }

    A(int p, int q) {    //parameterized
        x = p;
        y = q;
    }

    A(A ob) {      //copy cons
        x = ob.x;
        y = ob.y;
    }

    void show() {
        System.out.println("x = " + x + " y = " + y);
    }
}

