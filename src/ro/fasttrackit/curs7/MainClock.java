package ro.fasttrackit.curs7;

public class MainClock {
    public static void main(String[] args) {
        Clock clock = new Clock(10,6); //am definit si instantiat variabila Clock
        Clock ceasuLuiGhita = new Clock(11);

        System.out.println(clock.getTime());
        System.out.println(ceasuLuiGhita.getTime());

        clock.setTime(33, 62);
        System.out.println(clock.getTime());
    }
}
