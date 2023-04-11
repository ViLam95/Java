package demo.dahinh;

public class Test {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(3,3);
        ToaDo td2 = new ToaDo(2,6);
        ToaDo td3 = new ToaDo(5,5);
//        Hinh h = new Hinh();
        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2,10);
        Hinh h3 = new HinhChuNhat(td3,5,10);
        System.out.println("Dien tich hinh 1: "+h1.getArea());
        System.out.println("Dien tich hinh 2: "+h2.getArea());
        System.out.println("Dien tich hinh 3: "+h3.getArea());
    }
}
