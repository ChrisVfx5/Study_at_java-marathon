package Day11Task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPayed;
    private int bonus;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    protected int getBonus(){
        return bonus;
    }

    protected int getSalary() {
        return salary;
    }

   protected boolean getIsPayed() {
        return isPayed;
    }


    @Override
    public String toString() {
        return "Заработная плата сборщика составляет: " + getSalary() + "\nКакой бонус выплачен: " + getIsPayed();
    }


    @Override
    public void doWork() {
        salary += 80;
        warehouse.increasePickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10000) {
            bonus += 70000;

        } else {
            System.out.println("Бонус пока не доступен");
            return;

        }
        if (isPayed) {
            System.out.println("Бонус уже выплачен");

        }
        isPayed = true;
    }




}
