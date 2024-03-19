package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {
    private float height;
    private float base;
    public Triangle(){}
    public Triangle(String color, double height, double base)
    {
        super(color);
        this.height=(float)height;
        this.base=(float)base;
    }
    public Triangle(double height, double base)
    {
        this.height=(float)height;
        this.base=(float)base;
    }

    @Override
    public float getArea() {
        return base*height/2;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    public boolean equals(Object o)
    {
        return ((Triangle) o).height == height && ((Triangle) o).base == base;
    }
}
