package javaCollege.lecture;

public class prac2 {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        A.greet("Nishant");

        A ob = new A();
        ob.greet(null);
    }
    
}

class A{
    static void greet(String name){
        System.out.println("Hii "+name);
    }
}