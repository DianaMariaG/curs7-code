package ro.fasttrackit.curs7;

public class Bottle {
    //STATES
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    //constructor
    public Bottle(int totalCapacity, int availableLiquid, boolean open){
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    //BEHAVIOR
    public boolean hasLiquid(){
        if(this.availableLiquid > 0){
            return true;
        }
        return false;
    }

    public int getAvailableLiquid(){
        return availableLiquid;
    }

    public int getEmptyCapacity(){
        return totalCapacity - availableLiquid;
    }

    public String openBottle(){
        if(this.open){
            return "The bottle is already open!";
        }
        else {
            this.open = true;
            return "The bottle is now open!";
        }
    }

    public String closeBottle(){
        if(this.open){
            this.open = false;
            return "Bottle is closed now!";
        } else {
            return "The bottle is already closed!";
        }
    }

    public String drink(int desiredLiquidToDrink) {
        if (this.open == false) {
            return "First, you have to open the bottle!";
        }
        if (desiredLiquidToDrink <= this.availableLiquid) {
            this.availableLiquid = this.availableLiquid - desiredLiquidToDrink;
            return "You can drink " + desiredLiquidToDrink + " ml. Then, there will remain only " + (availableLiquid - desiredLiquidToDrink) + " ml.";
        } else {
            return "There is not enough liquid for you to drink";
        }
    }

    public String setAvailableLiquid(int consumedLiquid){
        int remainingLiquid = this.availableLiquid = consumedLiquid;
        return "Now, there are " + remainingLiquid +" ml.";
    }

    public String pourLiquid(int desiredLiquidToPour){
        if(desiredLiquidToPour <= getEmptyCapacity()){
            return "You can pour " + desiredLiquidToPour + " ml";
        } else {
            return "You can't pour this volume into the bottle!";
        }
    }
}
