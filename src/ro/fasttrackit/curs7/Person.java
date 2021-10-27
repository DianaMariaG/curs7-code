package ro.fasttrackit.curs7;
import java.util.*;

// STATE
public class Person {
    private String name;
    private int age;
    private boolean married;

    //constructor
    public Person(String name, int age, boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
    }
    //BEHAVIOR
    public String getName(){
        return name;
   }
    public int getAge(){
        return age;
    }
    public boolean isMarried(){
        return married;
    }

    public void setAge(int age){
        this.age = age; //primeste o noua valoare ca parametru, si modifica pe this.age(valoarea curenta)
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMarried(boolean married){
        this.married = married;
    }

    public String personDetails(){
        return name + " is " + age + " years old " + "and it's " + married + " that he/she is married.";
    }

    public String toString(){
        return name + " is " + age + " years old " + "and it's " + married + " that he/she is married. He/She is happy.";
    }
}
