package demo.dahinh;

public class HinhTron extends Hinh {
    private double r;

    public HinhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*this.r*this.r;
    }
}
