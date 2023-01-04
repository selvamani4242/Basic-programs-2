package sampleprojects.constructorexample;

public class Person {

        String name;


    public String getName() {
        return name;
    }

    public  Person(){
        this.name="selva";
    }
    public  Person(String name){
        this.name=name;
    }
}
