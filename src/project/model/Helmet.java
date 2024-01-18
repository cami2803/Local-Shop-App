package project.model;

//Implementation of the Item interface
public class Helmet implements Item{
    private int ID; //Stores the unique identifier of the helmet.
    private String helmetName; //Stores the name of the helmet.
    private float price; //Stores the price of the helmet.

    //Constructor that initializes the three fields with the values provided as parameters.
    public Helmet(int ID, String helmetName, float price) {
        this.ID = ID;
        this.helmetName = helmetName;
        this.price = price;
    }

    //Return the ID of the helmet
    @Override
    public int getID() {
        return ID;
    }

    //Return the name of the helmet
    @Override
    public String getName() {
        return helmetName;
    }

    //Return the price of the helmet
    @Override
    public float getPrice() {
        return price;
    }

}
