package Spielwiese;

public class B extends A {
    public B(String test) {
        //super();
        System.out.println("B: " + test);
    }
    public static void main(String[] args) {
        B b = new B("!");
    }
}