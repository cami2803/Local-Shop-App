package project.model;

//Implementation of the Item interface
public class RidingFootwear implements Item{
    private int ID; //Stores the unique identifier of the Riding Footwear
    private String footwearName; //Stores the name of the Riding Footwear
    private float price; //Stores the price of the Riding Footwear.

    //Constructor that initializes the three fields with the values provided as parameters.

    public RidingFootwear(int ID, String footwearName, float price) {
        this.ID = ID;
        this.footwearName = footwearName;
        this.price = price;
    }

    //Return the ID of the RidingFootwear
    @Override
    public int getID() {
        return ID;
    }

    //Return the name of the RidingFootwear
    @Override
    public String getName() {
        return footwearName;
    }

    //Return the price of the RidingFootwear
    @Override
    public float getPrice() {
        return price;
    }
}
