package exercicio_03.classes;

import exercicio_03.interfaces.IHerbivore;

public class Cow extends Animal implements IHerbivore {

    @Override
    public void emitSound() {
        System.out.println("Muuuu");
    }


    @Override
    public void eatPasture() {
        System.out.println("Comendo pasto...");
    }
}
