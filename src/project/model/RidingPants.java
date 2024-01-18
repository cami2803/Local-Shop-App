package project.model;

//Implementation of the Item interface
public class RidingPants implements Item {
    private int ID; //Stores the unique identifier of the RidingPants
    private String pantsName; //Stores the name of the RidingPants
    private float price; //Stores the price of the RidingPants

    //Constructor that initializes the three fields with the values provided as parameters.
    public RidingPants(int ID, String pantsName, float price) {
        this.ID = ID;
        this.pantsName = pantsName;
        this.price = price;
    }

    //Return the ID of the RidingPants
    @Override
    public int getID() {
        return ID;
    }

    //Return the name of the RidingPants
    @Override
    public String getName() {
        return pantsName;
    }

    //Return the price of the RidingPants
    @Override
    public float getPrice() {
        return price;
    }
}
