package Day11Task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Количество собранных заказов: " + getCountPickedOrders() + "\nКоличество доставленных заказов: " + getCountDeliveredOrders();
    }

    public void increasePickedOrders(){
        countPickedOrders++;
    }
    public void increaseDeliveredOrders(){
        countDeliveredOrders++;
    }
}
