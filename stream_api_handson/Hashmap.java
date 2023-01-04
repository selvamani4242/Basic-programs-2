package stream_api_handson;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> languages = new HashMap<>();

        languages.put("java",5);
        languages.put(".net",2);
        languages.put("java",4);
        languages.put("java",5);
        languages.put("java",5);
        languages.put("java",4);

        for(Entry<String,Integer> entry:languages.entrySet()){

            if(entry.getValue() == 5){

                System.out.println("The key for value is"+" "+entry.getKey());
                break;
            }
        }

       // Integer output = languages.get("java");
       // System.out.println(output);


    }
}


