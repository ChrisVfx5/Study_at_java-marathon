package Day5;

public class Task2 {
    public static void main(String[] args) {

        Motorbike bike1 = new Motorbike("Hasegawa", "Green", 2020);
        String getInfo = bike1.getInfo();
        System.out.println("Motorbike information:\n" + getInfo);



    }
}

class Motorbike{

    private String model;
    private String color;
    private int  yearOfIssue;

    protected Motorbike(String model, String color, int yearOfIssue){
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    protected String getInfo(){
        String info = "Model: " + model + "\nColor: " + color + "\nYear of issue: " + yearOfIssue;
        return info;
    }


}