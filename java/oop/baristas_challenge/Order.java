import java.util.ArrayList;

// Creating new data type called Order
public class Order {

// setting member variables to private
// String name default value = null
// boolean defaul value = false
// ArrayList defautl value = null + ArrayList initialized to empty list
  private String name;
  private boolean ready;
  private ArrayList<Item> items = new ArrayList<Item>();


// Constructor
// No arguments, sets name to "Guest"
  public Order(){
    this.name = "guest";
    this.ready = false;
  }


// overloaded constructor that takes Sting name as argument
  public Order( String name) {
    this.name = name;
    this.ready = false;
    
  }
// Accessors and mutators -- Getters/Setters

//name set/get
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }


// ready set/get
    public boolean getReady(){
        return this.ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }


// ArrayList set/get
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    
// Order Methods
// add item method
    public void addItem(Item item){
        this.items.add(item);
    }

// getStatusMessage method
    public String getStatusMessage(){
        if( this.ready == true ){
            return "Come on up, your order is ready!";
        }else{
            return "Your order will be ready soon, thank you for waiting!";
        }
    }

// getOrderTotal method
    //     public double getOrderTotal(){
    //         double total = 0.0;
    //         for(double i = 0; i < Items.length; i++ ){
    //             total =+ Items[(double)i];
    //     }
    //         return total;
    // }
    // looked up
    public double getOrderTotal(){
        double total = 0.0;
        for( Item i : this.items ) {
        total += i.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.printf("Customer Name: " + this.name);
        for( Item i : this.items ) {
            System.out.println(i.getName() + " - $" + i.getPrice());
    }
    System.out.println("Total: $" + this.getOrderTotal());
  }
}