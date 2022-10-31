package test;

public class Main {
    public static void main(String...args){
        SomeThing a = new A();
        a.doProcess();
        a = new B();
        a.doProcess();
    }
}
