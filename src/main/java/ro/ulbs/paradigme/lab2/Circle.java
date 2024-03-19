package ro.ulbs.paradigme.lab2;

import static java.lang.Math.pow;

public class Circle extends Form{
    private final double PI=3.14159265359;
    private float radius;
    public Circle(){}
    public Circle(String color, double radius)
    {
        super(color);
        this.radius=(float)radius;
    }
    public Circle(double radius)
    {
        this.radius=(float)radius;
    }
    @Override
    public float getArea()
    {
        return (float)(PI*pow(radius,2));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
