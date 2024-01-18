package project.model;

//Implementation of the Item interface
public class Vests implements Item{
    private int ID; //Stores the unique identifier of the vest
    private String vestName; //Stores the name of the vest
    private float price; //Stores the price of the vest

    //Constructor that initializes the three fields with the values provided as parameters.
    public Vests(int ID, String vestName, float price) {
        this.ID = ID;
        this.vestName = vestName;
        this.price = price;
    }

    //Return the ID of the vest
    @Override
    public int getID() {
        return ID;
    }

    //Return the name of the vest
    @Override
    public String getName() {
        return vestName;
    }

    //Return the price of the vest
    @Override
    public float getPrice() {
        return price;
    }
}
