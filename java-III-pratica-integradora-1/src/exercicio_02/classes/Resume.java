package exercicio_02.classes;

import java.util.ArrayList;

public class Resume extends Document {
    Person person;
    ArrayList<Skill> skillsList = new ArrayList<>();

    public Resume(Person person, ArrayList<Skill> skillsList) {
        super("Resume");
        this.setPerson(person);
        this.setSkillsList(skillsList);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public ArrayList<Skill> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(ArrayList<Skill> skillsList) {
        this.skillsList = skillsList;
    }

    @Override
    public String toString() {
        return ("Personal information" + "\n" +
                "Name: " + person.getName() + "\n" +
                "Last Name: " + person.getLastName() + "\n" +
                "Age: " + person.getAge() + "\n" +
                "------- Skills -------" + "\n" + skillsList);
    }
}
