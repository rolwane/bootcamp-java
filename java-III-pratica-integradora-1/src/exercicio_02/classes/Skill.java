package exercicio_02.classes;

public class Skill {
    String name;

    public Skill(String skill) {
        this.name = skill;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
