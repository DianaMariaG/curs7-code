package ro.fasttrackit.curs7;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Diana Gheorghe", 23, false); //date intacte de la inceput, care nu se mai modifica de aici
        Person person2 = new Person("Flavia", 29, true);
        Person person3 = new Person("Merlin", 950, false);

        //System.out.println(person.getAge());
        //System.out.println(person.getName());
        //System.out.println(person.isMarried());

        System.out.println(person1.personDetails());
        System.out.println(person2.getName());
        System.out.println(person3);

        person1.setAge(24);
        System.out.println(person1);

        person1.setName("Diana Rad");
        System.out.println(person1);

        person3.setMarried(true);
        System.out.println(person3);
    }
}

