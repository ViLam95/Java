package demo;

public class Run {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child p2 = new Child();
        Child c1 = new Child();
//        Parent c2 = new Parent();
//        Parent p3 = (Parent) c1;
//        Child c0 = (Child) p2;
        Child c3 = (Child) p1;
        p2.m1();
        p2.m2();
        c3.m2();
        c1.m2();
//        p3.m2();
//        p3.m1();
    }
}
