package Interviewconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Countnamechar {


    public static void main(String[] args) {

        String name = "selvamani";

        String[] output =name.split("");

     //  List<String> outputchar = Arrays.stream(output).filter(x -> x.equals("a") ).collect(Collectors.toList());

       // System.out.println(outputchar);

        ArrayList<String> inputname = (ArrayList<String>) Arrays.asList(output);

      List<String> outputname =  inputname.stream().filter(y -> y.equals("a")).collect(Collectors.toList());

        System.out.println(outputname);










    }
}
