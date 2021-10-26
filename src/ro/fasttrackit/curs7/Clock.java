package ro.fasttrackit.curs7;

public class Clock { //aici Clock e obiectul
    //STATE: variabile care stau pe obiect(variabile instanta), descriu obiectul Clock
    private int minutes;
    private int hour; //e field

    // e bine sa avem un singur constructor care modifica state-ul iar ceilalti dau default-uri
    public Clock(int hour, int minutes){ //aici Clock e constrctorul

        this.hour = Math.abs(hour % 24); //this: e field-ul hour, nu parametrul hour
        this.minutes = Math.abs(minutes % 60);
        // if(hour>23){ hour = 23; } sau throw new IllegalArgument
    }

    public Clock(int hour){ //alt constructor tot Clock denumit! asta e conventia: nume constructor=nume clasa
        this(hour, 0); //am apelat pe constructorul de sus; overloading
    }


    //BEHAVIOR: metode, care pot fi apelate pe obiect, descriu ce poate face obiectul
    public int getHour(){
        return hour;
    }
    public int getMinutes(){
        return minutes;
    }

    public String getTime(){
        return formatTime(hour) + ":" +formatTime(minutes);

    }

    public void setHour(int newHour){
        this.hour = ensureValid(newHour, 24);
    }

    public void setTime(int newHour, int newMinutes){
        this.hour = ensureValid(newHour, 24);
        this.minutes = ensureValid(newMinutes, 60);
    }

    private int ensureValid(int time, int ceiling){
        return Math.abs(time % ceiling);
    }

    private String formatTime(int minutes){
        if(minutes<10){
            return "0" + minutes;
        } else{
            return "" + minutes;
        }
    }
}
