package Day11Task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private int bonus;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    public int getBonus(){
        return bonus;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }


    @Override
    public String toString() {
        return "Заработная плата курьера оставляет " + getSalary() +"\nКакой бонус выплачен: " + getIsPayed();
    }


    @Override
    public void doWork() {
        salary += 100;
        warehouse.increaseDeliveredOrders();
    }

    @Override
    public void bonus() {
        if(warehouse.getCountDeliveredOrders() >= 10000){
            bonus += 50000;

        } else {
            System.out.println("Бонус пока не доступен");
            return;

        }
        if(isPayed){
            System.out.println("Бонус уже выплачен");

        }
        isPayed = true;


    }
}
