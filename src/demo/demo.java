package demo;

public class demo {
    //    public static void main(String[] args) {
//            int x = 10;
//            System.out.println("Before call process: " + x);
//            process(x);
//            System.out.println("After call process: " + x);
//        }
//        public static void process(int x) {
//            x = 7;
//            System.out.println("Kêt quả là: "+ x);
//        }

    public static void swap(Person first, Person second) {
        String temp = first.name;
        first.name = second.name;
        second.name = temp;
    }

    public static void main(String[] args) {
        Person a = new Person("John");
        Person b = new Person("Bill");
        swap(a, b);
        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);
    }
}