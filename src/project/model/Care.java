package project.model;

//Implementation of the Item interface
public class Care implements Item{
    private int ID; //Stores the unique identifier of the health care item.
    private String healthName; //Stores the name of the health care item.
    private float price; //Stores the price of the health care item.

    //Constructor that initializes the three fields with the values provided as parameters.
    public Care(int ID, String healthName, float price) {
        this.ID = ID;
        this.healthName = healthName;
        this.price = price;
    }

    //Return the ID of the health care item
    @Override
    public int getID() {
        return ID;
    }

    //Return the name of the health care item
    @Override
    public String getName() {
        return healthName;
    }

    //Return the price of the health care item
    @Override
    public float getPrice() {
        return price;
    }
}
