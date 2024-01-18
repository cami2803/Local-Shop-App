package project.model;

//Implementation of the Item interface
public class Pad implements Item{
    private int ID; //Stores the unique identifier of the saddle pad
    private String padName; //Stores the name of the saddle pad.
    private float price; //Stores the price of the saddle pad.

    //Constructor that initializes the three fields with the values provided as parameters.
    public Pad(int ID, String padName, float price) {
        this.ID = ID;
        this.padName = padName;
        this.price = price;
    }

    //Return the ID of the saddle pad
    @Override
    public int getID() {
        return ID;
    }

    //Return the name of the saddle pad
    @Override
    public String getName() {
        return padName;
    }

    //Return the price of the saddle pad
    @Override
    public float getPrice() {
        return price;
    }
}
