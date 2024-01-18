package project.model;

//Implementation of the Item interface
public class RidingGloves implements Item {
    private int ID; //Stores the unique identifier of the RidingGloves
    private String gloveName; //Stores the name of the RidingGloves
    private float price; //Stores the price of the RidingGloves

    //Constructor that initializes the three fields with the values provided as parameters.
    public RidingGloves(int ID, String gloveName, float price) {
        this.ID = ID;
        this.gloveName = gloveName;
        this.price = price;
    }

    //Return the ID of the RidingGloves
    @Override
    public int getID() {
        return ID;
    }

    //Return the name of the RidingGloves
    @Override
    public String getName() {
        return gloveName;
    }

    //Return the price of the RidingGloves
    @Override
    public float getPrice() {
        return price;
    }
}
