package Day6Task1;

public class Car {

    private String model;
    private String color;
    private int yearOfIssue;
    private int carAge;
    private String car = "Это автомобиль";

    protected Car(String model, String color, int yearOfIssue){
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    protected String getInfo(){
        String info = "Model: " + model + "\nColor: " + color + "\nYear of issue: " + yearOfIssue;
        return info;
    }
protected void info(){
    System.out.println(car);
}
    protected int yearDifference(int inputYear){
        if(inputYear <= yearOfIssue) {
            return 0;
        } else {
        this.carAge = inputYear - yearOfIssue;
        return carAge;
        }
    }

    protected String ageInfo(){
        String result;
        if(carAge == 0){
            result = "Автомобиль еще не выпущен";
        }else {
            result = "Car age: " + carAge;
        }
        return result;
    }




}
