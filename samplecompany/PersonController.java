package samplecompany;

public class PersonController {



    public static void main(String[] args){

        int input = 3;
        PersonCompositeService personCompositeService = new PersonCompositeService();
        Person person = personCompositeService.getPerson(input);

        System.out.println(person.getExperience().getTechnology());

    }
}
