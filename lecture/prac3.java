package javaCollege.lecture;
//method overloading

public class prac3 {
    public static void main(String[] args) {
        A ob = new A();
        ob.show();
        ob.show(30);
        ob.show(40,50);
    }
    
}

class A{
    int x =10, y = 20;

    void show(){
        System.out.println("x = "+x+" y = "+y);
    }

    void show(int p){
        x = y = p;
        System.out.println("x = "+x+" y = "+y);
    }

    void show(int p,int q){
        x =  p;
        y = q;
        System.out.println("x = "+x+" y = "+y);
    }
}