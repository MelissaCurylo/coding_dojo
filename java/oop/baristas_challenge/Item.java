public class Item {

    // setting member variables to private
    private String name;
    private double price;

    public Item(){}

    // adding constructor with argumentsL String name and double price
    // these arguments set the name and price for object on instantiation
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }


    // Getters
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }


    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void sePrice(double price){
    this.price = price;
    }

}