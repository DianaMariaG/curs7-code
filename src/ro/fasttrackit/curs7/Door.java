package ro.fasttrackit.curs7;


//getters/setters
public class Door {
    //STATE inchis/deschis
    private boolean open;

    //constructor
    public Door(){
        this.open = false;
    }

    //BEHAVIOR
    public boolean isOpen(){
        return open;
    }

    public void close(){
        if(this.open){
            System.out.println("The door is already close");
        } else {
            this.open = false;
        }
    }

    public void open(){
        if(this.open) {
            System.out.println("the door is already open");
        } else {
            this.open = true;
        }
    }
}
