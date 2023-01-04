package stream_api_handson;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class PersondetailController {


    public static void main(String[] args) {



        PersondetailsService persondetailsService=new PersondetailsService();

        ArrayList<Persondetail> showpersondetails = persondetailsService.getInfo();

        Map<String, Long> output = showpersondetails.stream().collect(Collectors.groupingBy(Persondetail::getTechnology,Collectors.counting()));

        System.out.println(output);
    }
}
