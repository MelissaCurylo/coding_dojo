import java.util.ArrayList;

/// all methods go here

public class CafeUtil {
    public int getStreakGoal(){
        int sum = 0;
        for (int i = 1; i < 11 ; i++){
            sum += i;
        }
        return sum;
    }
    public double getOrderTotal( double[] lineItems ){
        double total = 0;
        for(double i = 0; i < lineItems.length; i++){
            total +=lineItems[(int) i];
        }
        return total;
    }

    // alternate way via ternary
    // public double getOrderTotal( double[] prices ){
    //     double sum = 0.00;
    //     for(double price : prices ){
    //         sum += price;
    //     }
    //     return sum;
    // }

    public void displayMenu (ArrayList<String> menuItems ){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer (ArrayList<String> customers ){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName );
        System.out.println("There are " + " " + customers.size() + " " + "people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }
}