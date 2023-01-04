package Interviewconcepts;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Stringjoining {


    public static void main(String[] args) {

      //  List<Character> inputchar = Arrays.asList('w','e','l','c','o','m','e');

       //  String outputname  = inputchar.stream().map(String::valueOf).collect(Collectors.joining());

       // System.out.println(outputname);

        PersonService listofpersonService = new PersonService();

        ArrayList<Person> person = listofpersonService.getPertson();

      String personoutput =  person.stream().map(Person::getName).collect(Collectors.joining(","));

        System.out.println(personoutput);





    }
}

