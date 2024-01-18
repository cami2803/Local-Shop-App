package project.model;

//Implementation of the Item interface
public class Rug implements Item{
    private int ID; //Stores the unique identifier of the rug
    private String rugName; //Stores the name of the rug
    private float price; //Stores the price of the rug

    //Constructor that initializes the three fields with the values provided as parameters.
    public Rug(int ID, String rugName, float price) {
        this.ID = ID;
        this.rugName = rugName;
        this.price = price;
    }

    //Return the ID of the rug
    @Override
    public int getID() {
        return ID;
    }

    //Return the name of the rug
    @Override
    public String getName() {
        return rugName;
    }

    //Return the price of the rug
    @Override
    public float getPrice() {
        return price;
    }
}
