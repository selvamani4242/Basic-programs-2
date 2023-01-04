package Interviewconcepts;

import java.util.ArrayList;

public class PersonService {


    public ArrayList<Person> getPertson(){


        ArrayList<Person> person = new ArrayList<>();

        Person person1 = new Person();
        person1.setName("selva");
        person1.setAge(25);

        Person person2 = new Person();
        person2.setName("dinesh");
        person2.setAge(22);

        Person person3 = new Person();
        person3.setName("raju");
        person3.setAge(21);

        Person person4 = new Person();
        person4.setName("yohi");
        person4.setAge(23);

        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person4);

        return  person;


    }


}
