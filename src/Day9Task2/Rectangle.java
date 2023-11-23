package Day9Task2;


public class Rectangle extends Figure {

    private double weight;
    private double height;

    public Rectangle(double weight, double height, String color){
        super(color);
        this.weight = weight;
        this.height = height;
    }


    @Override
    protected double area() {
        double area;
        area = height * weight;
        return area;
    }

    @Override
    protected double perimeter() {
       double perimeter;
       perimeter = 2 * (height + weight);
        return perimeter;
    }
}
