import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){

        // Menu items

        Item item1 = new Item("Mocha", 4.25);
        Item item2 = new Item("Latte", 4.25);
        Item item3 = new Item("Drop Coffee", 4.25);
        Item item4 = new Item("Cappuccino", 4.25);


        // Item item1 = new Item();
        // item1.name = "Mocha";
        // item1.price = 4.25;

        // Item item2 = new Item();
        // item2.name = "Latte";
        // item2.price = 4.25;

        // Item item3 = new Item();
        // item3.name = "Drip Coffee";
        // item3.price = 4.25;

        // Item item4 = new Item();
        // item4.name = "Cappuccino";
        // item4.price = 4.25;


        // orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Chindhuri");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Noah");



        // testing addItem, getStatusMessage, getOrderTotal. and display methods
        order3.addItem(item1);
        order3.addItem(item2);
        order3.setReady(true);
        order3.display();
        System.out.println(order3.getStatusMessage());
        System.out.println(order3.getOrderTotal());


        order4.addItem(item2);
        order4.addItem(item3);
        order4.setReady(true);
        order4.display();
        System.out.println(order4.getStatusMessage());
        System.out.println(order4.getOrderTotal());


        order5.addItem(item2);
        order5.addItem(item3);
        order5.addItem(item1);
        order5.addItem(item4);
        order5.setReady(true);
        order5.display();
        System.out.println(order5.getStatusMessage());
        System.out.println(order5.getOrderTotal());
    }
}