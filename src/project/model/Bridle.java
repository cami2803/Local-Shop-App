package project.model;

//Implementation of the Item interface
public class Bridle implements Item {
    private int ID; //Stores the unique identifier of the bridle.
    private String bridleName; //Stores the name of the bridle.
    private float price; //Stores the price of the bridle.

    //Constructor that initializes the three fields with the values provided as parameters.
    public Bridle(int ID, String bridleName, float price) {
        this.ID = ID;
        this.bridleName = bridleName;
        this.price = price;
    }

    //Return the ID of the bridle
    @Override
    public int getID() {
        return ID;
    }

    //Return the name of the bridle
    @Override
    public String getName() {
        return bridleName;
    }

    //Return the price of the bridle
    @Override
    public float getPrice() {
        return price;
    }
}
