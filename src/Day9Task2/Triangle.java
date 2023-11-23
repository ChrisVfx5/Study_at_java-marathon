package Day9Task2;

public class Triangle extends Figure{

    private double sideLengthA;
    private double sideLengthB;
    private double sideLengthC;

    public Triangle(double sideLengthA, double sideLengthB, double sideLengthC, String color){
        super(color);
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.sideLengthC = sideLengthC;
    }

    @Override
    protected double area() {
        double halfPerimeter;
        halfPerimeter = perimeter()/2.0;
        double area;
        area = Math.sqrt(halfPerimeter*(halfPerimeter - sideLengthA)*(halfPerimeter - sideLengthB)*(halfPerimeter - sideLengthC));
        return area;
    }


    @Override
    protected double perimeter() {
        double perimeter;
        perimeter = sideLengthA + sideLengthB + sideLengthC;
        return perimeter;
    }




}

