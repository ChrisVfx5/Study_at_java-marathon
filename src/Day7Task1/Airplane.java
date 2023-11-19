package Day7Task1;

public class Airplane {

    private String manufacturer;
    private String model;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    //Сеттеры
    protected void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    protected void setModel(String model){
        this.model = model;
    }
    protected void setYear(int year){
        this.year = year;
    }
    protected void setLength(int length){
        this.length = length;
    }
    protected void setWeight(int weight){
        this.weight = weight;
    }
    protected void setFuel(int fuel){
        this.fuel = fuel;
    }

    // Геттер
    protected int getFuel(){
        return fuel;
    }
    protected int getLength(){
        return length;
    }
    protected String getModel(){
        return model;
    }
    protected String getManufacturer(){
        return manufacturer;
    }

    // Конструктор
    public Airplane(String manufacturer, String model, int year, int length, int weight){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    protected static void compareAirplanes(Airplane a, Airplane b){
        a.getLength();
        b.getLength();
        int compare;
        if(a.length > b.length){
            compare = a.length - b.length;
        }else {
            compare = b.length - a.length;
        }


        if(a.length>b.length){
            System.out.println("Самолет " + a.getModel()+ " производства " + a.getManufacturer() + " больше самолета " + b.getModel() + " производства " + b.getManufacturer() + " на " + compare + " метров.");
        }else {
            System.out.println("Самолет " + a.getModel()+ " производства " + a.getManufacturer() + " меньше самолета " + b.getModel() + " производства " + b.getManufacturer()+ " на " + compare + " метров.");
        }
    }





}
