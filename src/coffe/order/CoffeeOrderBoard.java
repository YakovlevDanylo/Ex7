package coffe.order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> ordersQueue;
    private int nextOrderNum;

    public CoffeeOrderBoard() {
        this.ordersQueue = new LinkedList<>();
        nextOrderNum = 1;
    }

    public void add(String customerName) {
        ordersQueue.add(new Order(nextOrderNum, customerName));
        nextOrderNum++;
    }

    public Order deliver() {
        return ordersQueue.poll();
    }

    public Order deliver(int orderNumber) {
        for(Order order : ordersQueue) {
            if(order.getOrderNumber() == orderNumber) {
                 ordersQueue.remove(order);
                System.out.println("\nComplete order:\n" + order);
                 return order;
            }
        }
        System.out.println("Order dose not exist");
        return null;
    }

    public void draw() {
        System.out.println("\nNum | Name");
        for(Order order : ordersQueue) {
            System.out.println(order);
        }
    }
}
