package Day9Task2;

public class TestFigure {
    public static void main(String[] args) {

        Figure[] figures = {new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println("Cумма периметров красных фигур равна: " + calculateRedPerimeter(figures));

        System.out.println("Cумма площадей красных фигур: " + calculateRedArea(figures));


    }


    public static double calculateRedPerimeter(Figure[] figures){
        double sum= 0;
        for (Figure el : figures){
            if("Red".equals(el.getColor())){
                sum += el.perimeter();
            }
        }
        return sum;
    }


    public static double calculateRedArea(Figure[] figures){
        double sum = 0;
        for(Figure el: figures){
            if("Red".equals(el.getColor())){
                sum += el.area();
            }
        }
        return sum;
    }




}



