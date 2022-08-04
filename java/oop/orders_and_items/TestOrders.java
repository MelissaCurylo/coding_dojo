import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args){

        // Item item1 = new Item("Mocha", 4.25);
        // Item item2 = new Item("Latte", 5.25);
        // Item item3 = new Item("Drip Coffee", 3.25);
        // Item item4 = new Item("Cappuccino", 5.25);

        // ^^ can this be written alternatively as?
        // 4 item variables of type item instantiated as Item object + declared.
       // Need 'new' keyword in order to instantiate a class by allocating memory for the new object.

        Item item1 = new Item();
        item1.name = "Mocha";
        item1.price = 4.25;

        Item item2 = new Item();
        item2.name = "Latte";
        item2.price = 4.25;

        Item item3 = new Item();
        item3.name = "Drip Coffee";
        item3.price = 4.25;

        Item item4 = new Item();
        item4.name = "Cappuccino";
        item4.price = 4.25;


        // Order order1 = new Order("Cindhuri");
        // Order order2 = new Order("Jimmy");
        // Order order3 = new Order("Noah");
        // Order order4 = new Order("Sam");

        // ^^ can these be written alternatively as?
        // 4 order variables of type Order instantiated as an Order object.
        // Need 'new' keyword in order to instantiate a class by allocating memory for the new object.
        // Printing order 1 total will default to 0.0 as nothing has been assigned yet.
        Order order1 = new Order();
        // System.out.println(order1.total);
        order1.name = "Chindhuri";

        Order order2 = new Order();
        // System.out.println(order2.total);
        order2.name = "Jimmy";

        Order order3 = new Order();
        // System.out.println(order3.total);
        order3.name = "Noah";

        Order order4 = new Order();
        // System.out.println(order4.total);
        order4.name = "Sam";


        // Added an extra order for Cindhuri + incremented
        //Cindhuri's order is ready, update status
        order1.items.add(item3);
        order1.total += item3.price * 2;
        order1.ready = true;
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Your total is: %s\n", order1.total);
        System.out.printf("Name: " + order1.name + "  " + "Your order is Ready: " + order1.ready);
    
        // order2 ordered a mocha (item1) add to order2 listed items
        // Increment the total
        // Jimmy order is now ready, update status
        order2.items.add(item1);
        order2.total += item1.price;
        order2.ready = true;
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Your total is: %s\n", order2.total);
        System.out.printf("Name: " + order2.name + "  " + "Your order is Ready: " + order2.ready);


        // order3 is ordered a cappuccino, add it to order3 listed items
        // Increment the total
        order3.items.add(item4);
        order3.total =+ item4.price;
        order3.ready = false;
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Your total is: %s\n", order3.total);
        // System.out.printf("Name: " + order3.name + "  " + "Your order is Ready: " + order3.ready);

        // order4 ordered a latte, add to order4 listed items
        // Increment the total
        order4.items.add(item2);
        order4.total =+ item2.price;
        // Sam ordered two more lattes - update the listed items + increment total
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total =+ item2.price * 3;
        order4.ready = false;
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Your total is: %s\n", order4.total);
        // System.out.printf("Name: " + order4.name + "  " + "Your order is Ready: " + order4.ready);
    }
}