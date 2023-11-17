package Day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Nissan", "Blue", 2015);
        System.out.println("Информация о моделе:\n" + car1.getInfo());



    }
}

class Car {
    private String model;
    private String color;
    private int yearOfIssue;

    protected void setInfo(String model, String color, int yearOfIssue){
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    protected String getInfo(){
        String info = "Модель: " + model + "\nЦвет: " + color + "\nГод выпуска: " + yearOfIssue;
        return info;
    }


}
