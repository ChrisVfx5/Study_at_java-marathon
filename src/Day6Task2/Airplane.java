package Day6Task2;

public class Airplane {

private String manufacturer;
private int year;
private int length;
private int weight;
private int fuel;


//Сеттеры
    protected void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
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

    // Конструктор
    public Airplane(String manufacturer, int year, int length, int weight, int fuel){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    protected void info(){
        System.out.println("Изготовитель:" + manufacturer + "\nГод выпуска: " +year +  "\nДлина: " + length +
                "\nВес: " + weight + "\nКоличество топлива в баке: " + fuel);
    }


    protected int fillUp(int amount){
        this.fuel += amount;
        return fuel;
    }


}
