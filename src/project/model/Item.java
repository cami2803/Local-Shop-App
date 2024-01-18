package project.model;

//It is a contract that specifies three methods that any implementing class must have:
public interface Item {
    int getID(); //Should return an int representing the unique identifier of the item.
    String getName(); //Should return a String representing the name of the item.
    float getPrice(); //Should return a float representing the price of the item.
}
