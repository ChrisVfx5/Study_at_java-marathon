package Day6Task2;

public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Boeing", 2018, 54, 160, 0);
        System.out.println("Количетсво топлива в баке: " + airplane.getFuel());
        airplane.setYear(2015);
        airplane.setLength(60);
        airplane.fillUp(300);
        airplane.info();



    }

}

