package ro.ulbs.paradigme.lab2;

import static java.lang.Math.pow;

public class Square extends Form {
    private float side;
    public Square()
    {
    }
    public Square(String color, double side)
    {
        super(color);
        this.side=(float)side;
    }
    public Square(double side)
    {
        this.side=(float)side;
    }

    @Override
    public float getArea() {
        return (float)pow(side,2);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
