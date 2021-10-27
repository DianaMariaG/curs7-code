package ro.fasttrackit.curs7;
import java.util.*;

public class Product {
    //STATES
    private String name;
    private int price;
    private int quantity;
    private String category;

    //constructor
    public Product(String name, int price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
    //BEHAVIOR
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getCategory(){
        return category;
    }

    public boolean hasStock(){
        if(this.quantity != 0){
            return true;
        }
        return false;
    }

    public boolean isCategory(String newCategory){
        if(this.category.equals(newCategory)){
            return true;
        }
        return false;
    }
}
