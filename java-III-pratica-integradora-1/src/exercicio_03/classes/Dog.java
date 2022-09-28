package exercicio_03.classes;

import exercicio_03.interfaces.ICarnivore;

public class Dog extends Animal implements ICarnivore {

    @Override
    public void emitSound() {
        System.out.println("Auau");
    }

    @Override
    public void eatMeat() {
        System.out.println("Comendo carne...");
    }
}
