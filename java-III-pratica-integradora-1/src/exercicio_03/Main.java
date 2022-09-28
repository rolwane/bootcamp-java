package exercicio_03;

import exercicio_03.classes.Cat;
import exercicio_03.classes.Cow;
import exercicio_03.classes.Dog;

public class Main {
    public static void main(String[] args) {
        // criando os animais
        Dog scoobyDoo = new Dog();
        Cat tom = new Cat();
        Cow mimosa = new Cow();

        // animais emitindo os sons
        scoobyDoo.emitSound();
        tom.emitSound();
        mimosa.emitSound();

        // animais comendo
        scoobyDoo.eatMeat();
        tom.eatMeat();
        mimosa.eatPasture();
    }
}
