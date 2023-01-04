package samplecompany;

public class AddressService {

    public Address getAddress(int i){

        String c;
        String s;

        if(i == 1) {
            c = "theni";
            s = "TN";
            return new Address(c,s);
        } else if(i == 2) {
            c = "madurai";
            s = "TN";
            return new Address(c, s);
        } else if(i == 3){
            c = "vellor";
            s = "TN";
            return new Address(c,s);
        }
        return null;
    }
}
