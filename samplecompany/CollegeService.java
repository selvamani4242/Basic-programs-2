package samplecompany;

public class CollegeService {

    public College getCollege(int i){

        String c;
        if(i == 1) {
            c = "KLU";
            return new College(c);
        } else if(i == 2) {
            c = "SRM";
            return new College(c);
        } else if(i == 3){
            c = "KLN";
            return  new College(c);
        }
        return null;
    }
}
