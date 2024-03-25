package ro.ulbs.paradigme.lab2;

public class Form {
    private String color;
    private static int contor;
    public Form()
    {
        color="white";
        contor++;
    }
    public Form(String color)
    {
        this.color=color;
        contor++;
    }
    public float getArea()
    {
        return 0;
    }

    public String toString()
    {
        return "this form has the color "+ color;
    }
    public int getContor()
    {
        return contor;
    }
}
