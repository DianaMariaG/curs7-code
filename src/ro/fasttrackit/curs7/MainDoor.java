package ro.fasttrackit.curs7;

public class MainDoor {
    public static void main(String[] args) {
        Door door = new Door();

        System.out.println(door.isOpen());
        door.open();
        System.out.println(door.isOpen());
    }
}
