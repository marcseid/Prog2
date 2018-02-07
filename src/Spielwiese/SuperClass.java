package Spielwiese;

public class SuperClass{
    public void method1() {
        System.out.println("superclass method1");
        this.method2();
    }
    public void method2() {
        System.out.println("superclass method2");
    }
    public static void main(String[] args) {
        SuperClass s = new SubClass();
        s.method1();
    }
}