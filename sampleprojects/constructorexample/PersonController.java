package sampleprojects.constructorexample;

public class PersonController {


     public static void main(String[] args){

        PersonService personService=new PersonService();

        String person= personService.getName("selva");

        String prsn=person;

        System.out.println(prsn);
     }
}
