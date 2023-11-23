package Day9Task2;

public abstract class Figure {

    private String color;

    public Figure(String color){
        this.color = color;
    }

    protected String getColor(){
        return color;
    }
    protected abstract double area();

    protected abstract double perimeter();
}
