package samplecompany;

public class ExperienceService {

    public Experience getExperience(int i) {
        int exp;
        String technology;
        if (i == 1) {
            exp = 1;
            technology = "Java";
            return new Experience(exp, technology);
        } else if (i == 2) {
            exp = 2;
            technology = "Groovy";
            return new Experience(exp, technology);
        } else if (i == 3) {
            exp = 3;
            technology = "Jquery";
            return new Experience(exp, technology);
        }
        return null;
    }
}
