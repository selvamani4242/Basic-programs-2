package samplecompany;

public class HobbyService {

    public Hobby getHobby(int i){

        String h;
        if(i == 1){
            h = "cricket";
            return  new Hobby(h);
        } else if(i == 2){
            h = "hockey";
            return new Hobby(h);
        } else if(i == 3){
            h = "football";
            return new Hobby(h);
        }
        return  null;
    }
}
