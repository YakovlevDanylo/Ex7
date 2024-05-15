import coffe.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
        orderBoard.add("Ella");
        orderBoard.add("Bella");
        orderBoard.add("Kristopher");
        orderBoard.add("Danil");

        orderBoard.deliver();
        orderBoard.draw();
        orderBoard.deliver(3);
        orderBoard.draw();
    }
}