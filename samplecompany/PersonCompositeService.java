package samplecompany;

public class PersonCompositeService {


    public Person getPerson(int i){

        AddressService addressService = new AddressService();
        CollegeService collegeService = new CollegeService();
        HobbyService hobbyService = new HobbyService();
        ExperienceService experienceService = new ExperienceService();

        Address address = addressService.getAddress(i);
        College college = collegeService.getCollege(i);
        Hobby hobby = hobbyService.getHobby(i);
        Experience experience = experienceService.getExperience(i);

        Person person = new Person(address, experience, college, hobby);
        return person;
    }
}
