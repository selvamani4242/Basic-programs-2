package sampleprojects.constructorexample;

public class PersonService {


    public  String getName(String name){

        String a=name;
        return  a;
    }

    public String getDefaultConsname(){

        Person person=new Person();
        return person.getName();
    }

    public String getParaConsname(){

        Person person=new Person("selva");
        return  person.getName();
    }
}
