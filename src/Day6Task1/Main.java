package Day6Task1;

public class Main {
    public static void main(String[] args) {


       Car car = new Car("BMW", "Black", 1995);
       String carInfo = car.getInfo();
       int carAge = car.yearDifference(2020);
       car.info();
       System.out.println(carInfo + "\n" + car.ageInfo());

        System.out.println()
        ;
       Motorbike moto = new Motorbike("Hasegawa", "White", 2020);
       String motoInfo = moto.getInfo();
       int motoAge = moto.yearDifference(2019);
       String ageInfo = moto.ageInfo();
       moto.info();
       System.out.println(motoInfo + "\n" + ageInfo);








    }
}
