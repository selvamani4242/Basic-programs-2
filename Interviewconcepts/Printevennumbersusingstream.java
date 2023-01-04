package Interviewconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Printevennumbersusingstream {


    public static void main(String[] args) {

        Integer[] evennumbers = {1,2,3,4,5,6,7,8,9,10};

         ArrayList<Integer>  al = (ArrayList<Integer>) Arrays.asList(evennumbers);

         ArrayList<Integer> results = (ArrayList<Integer>) al.stream().filter(a -> a % 2 == 0 ).collect(Collectors.toList());

        results.forEach(x -> System.out.println(x));
    }
}
