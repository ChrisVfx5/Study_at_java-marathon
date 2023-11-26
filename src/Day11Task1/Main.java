package Day11Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);

        Courier courier1 = new Courier(warehouse1);
        Courier courier2 = new Courier(warehouse1);
        Courier courier3 = new Courier(warehouse1);
        Courier courier4 = new Courier(warehouse1);
        Courier courier5 = new Courier(warehouse1);

        businessProcess(picker1);
        businessProcess(courier1);
        businessProcess(courier2);
        businessProcess(courier3);
        businessProcess(courier4);
        businessProcess(courier5);
        System.out.println("Количество собранных заказов на складе: " + warehouse1.getCountPickedOrders());
        System.out.println("Количество доставленных заказов: " + warehouse1.getCountDeliveredOrders());
        System.out.println();
        System.out.println("Зарплата сборщика: " + picker1.getSalary() + "\nБонус сборщика: " + picker1.getBonus());
        System.out.println("Зарплата курьера 1: " + courier1.getSalary() + "\nБонус курьера 1: " + courier1.getBonus());



        System.out.println("\n\n");
        System.out.println("Зарплата курьера 2: " + courier2.getSalary() + "\nБонус курьера 2: " + courier2.getBonus());
        System.out.println("Зарплата курьера 3: " + courier3.getSalary() + "\nБонус курьера 3: " + courier3.getBonus());
        System.out.println("Зарплата курьера 4: " + courier4.getSalary() + "\nБонус курьера 4: " + courier4.getBonus());
        System.out.println("Зарплата курьера 5: " + courier5.getSalary() + "\nБонус курьера 5: " + courier5.getBonus());

        businessProcess(courier2);
        businessProcess(courier3);
        System.out.println("Количество доставленных заказов: " + warehouse1.getCountDeliveredOrders());


        System.out.println("\n\n");
        //ВТОРОЙ СКЛАД
        Warehouse warehouse2 = new Warehouse();
        Picker picker22 = new Picker(warehouse2);
        Courier courier22 = new Courier(warehouse2);

        businessProcess(picker22);
        businessProcess(courier22);
        System.out.println("Количество собранных заказов на складе 2: " + warehouse2.getCountPickedOrders());
        System.out.println("Количество доставленных заказов: " + warehouse2.getCountDeliveredOrders());
        System.out.println();
        System.out.println("Зарплата сборщика со второго склада: " + picker22.getSalary() + "\nБонус сборщика: " + picker22.getBonus());
        System.out.println("Зарплата курьера со второго склада: " + courier22.getSalary() + "\nБонус курьера: " + courier22.getBonus());




    }

    public static void businessProcess(Worker worker){
        for (int i = 1; i<= 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }

    public static void businessProcessRand(Worker worker){
        Random random = new Random();
        int rand = random.nextInt(10000);
        for (int i = 1; i<= rand; i++){
            worker.doWork();
        }
        worker.bonus();
    }




}
