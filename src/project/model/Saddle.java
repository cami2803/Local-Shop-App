package project.model;

//Implementation of the Item interface
public class Saddle implements Item {
    private int ID; //Stores the unique identifier of the saddle
    private String saddleName; //Stores the name of the saddle
    private float price; //Stores the price of the saddle

    //Constructor that initializes the three fields with the values provided as parameters.
    public Saddle(int ID, String saddleName, float price) {
        this.ID = ID;
        this.saddleName = saddleName;
        this.price = price;
    }

    //Return the ID of the saddle
    @Override
    public int getID() {
        return ID;
    }

    //Return the name the saddle
    @Override
    public String getName() {
        return saddleName;
    }

    //Return the price of the saddle
    @Override
    public float getPrice() {
        return price;
    }
}
