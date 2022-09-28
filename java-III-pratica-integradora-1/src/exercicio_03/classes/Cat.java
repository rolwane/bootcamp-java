package exercicio_03.classes;

import exercicio_03.interfaces.ICarnivore;

public class Cat extends Animal implements ICarnivore {

    @Override
    public void emitSound() {
        System.out.println("Miau");
    }

    @Override
    public void eatMeat() {
        System.out.println("Comendo carne...");
    }
}
