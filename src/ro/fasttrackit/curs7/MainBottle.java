package ro.fasttrackit.curs7;

public class MainBottle {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(500, 270, true);
        Bottle bottle2 = new Bottle(1000, 425, false);
        Bottle bottle3 = new Bottle( 2000, 0, false);

        System.out.println(bottle2.conditionToDrink(40)); //you can't drink because the bottle is closed
        System.out.println(bottle2.openBottle()); // opens bottle2
        System.out.println(bottle2.openBottle()); // says that bottle2 is already open
        System.out.println(bottle2.conditionToDrink(40)); //you can drink now
        System.out.println(bottle2.setAvailableLiquid(345)); // new availableLiquid
        System.out.println(bottle2.conditionToDrink(25)); //you can drink again


        System.out.println(bottle1.closeBottle()); // closes bottle1
        System.out.println(bottle1.openBottle());  // opens bottle1 again

        System.out.println(bottle2.getEmptyCapacity());
        System.out.println(bottle3.hasLiquid());


        System.out.println(bottle3.pourLiquid(3000));


    }
}
