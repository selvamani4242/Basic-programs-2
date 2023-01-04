package samplecompany;


public class Person {


    Address address;
    Experience experience;
    College college;
    Hobby hobby;

    public Person(Address address, Experience experience, College college, Hobby hobby) {

        this.address = address;
        this.experience = experience;
        this.college = college;
        this.hobby = hobby;

    }

    public Address getAddress() {
        return address;
    }

    public Experience getExperience() {
        return experience;
    }

    public College getCollege() {
        return college;
    }

    public Hobby getHobby() {
        return hobby;
    }




}
