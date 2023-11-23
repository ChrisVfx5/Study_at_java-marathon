package Day9Task2;

public class Circle extends Figure{

    private double circleRadius;

    public Circle(double circleRadius, String color){
        super(color);
        this.circleRadius = circleRadius;
    }


    @Override
    protected double area() {
        double area;
        area = Math.PI * Math.pow(circleRadius, 2);
        return area;
    }

    @Override
    protected double perimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * circleRadius;
        return perimeter;
    }
}
