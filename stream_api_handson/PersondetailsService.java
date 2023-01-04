package stream_api_handson;

import java.util.ArrayList;

public class PersondetailsService {


    public  ArrayList<Persondetail> getInfo(){

        ArrayList<Persondetail> persondetails =new ArrayList<>();

        Persondetail person1 = new Persondetail();
        person1.setName("AAA");
        person1.setAge(25);
        person1.setExp(5);
        person1.setTechnology("java");

        Persondetail person2 = new Persondetail();
        person2.setName("BBB");
        person2.setAge(26);
        person2.setExp(26);
        person2.setTechnology(".net");

        Persondetail person3 = new Persondetail();
        person3.setName("CCC");
        person3.setAge(27);
        person3.setExp(4);
        person3.setTechnology("java");

        Persondetail person4 = new Persondetail();
        person4.setName("DDD");
        person4.setAge(28);
        person4.setExp(5);
        person4.setTechnology("java");

        persondetails.add(person1);
        persondetails.add(person2);
        persondetails.add(person3);
        persondetails.add(person4);

        return  persondetails;

    }
}
