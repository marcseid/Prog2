package Spielwiese;

public class SubClass extends SuperClass {
    @Override
    public void method1() {
        System.out.println("subclass method1");
        super.method1();
    }
    @Override
    public void method2() {
        System.out.println("subclass method2");
    }
}