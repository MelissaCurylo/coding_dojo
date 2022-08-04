import java.util.ArrayList;

// Creating a new data type called Order
// Add String name, double total, boolean ready, and ArraList<item>items

public class Order {
    
    // Order variables + can make accesseors private but not required in assignment
    // Need Order class variables: name, total, and ready with default values for data type
    // name default value will be null
    // total default value will be zero
    // ready default value will be false 
    public String name; 
    public double total;
    public boolean ready;


    // default for ArrayList would be index 0
    public ArrayList<Item> items = new ArrayList<Item>();
}