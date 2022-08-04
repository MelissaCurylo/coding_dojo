public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 4.5;
        double latte = 5.5;
        int cappucinno = 5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)

        // Displays greeting and order status
        System.out.println(generalGreeting + customer1 + "!");
        System.out.println(isReadyOrder1 ? displayTotalMessage + dripCoffee : pendingMessage);

        System.out.println("");

        // Displays greeting and order status
        System.out.println(generalGreeting + customer2 + "!");
        System.out.println(isReadyOrder2 ? displayTotalMessage + mochaPrice * 2 : pendingMessage);
        
        System.out.println("");

        // Displays greeting and order status
        System.out.println(generalGreeting + customer3 + "!");
        System.out.println(isReadyOrder3 ? displayTotalMessage + latte : displayTotalMessage + latte + pendingMessage);

        System.out.println("");

        // Displays greeting  and order status
        System.out.println(generalGreeting + customer4 + "!"); 
        System.out.println(isReadyOrder4 ? displayTotalMessage + cappucinno : pendingMessage);
    }
}
