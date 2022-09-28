package exercicio_02;

import exercicio_02.classes.*;
import exercicio_02.interfaces.IPrint;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // criando um livro para imprimir
        Document book = new Book("Lord of the rings", "J. R. R. Tolkien", "Alta fantasía", 99999);

        // criando uma pessoa
        Person person = new Person("Antonia", "Bastos", 25);

        // criando uma lista de habilidades
        ArrayList<Skill> skillsList = new ArrayList<>();

        // salvando habilidades na lista
        skillsList.add(new Skill("java"));
        skillsList.add(new Skill("javaScript"));
        skillsList.add(new Skill("typeScript"));
        skillsList.add(new Skill("python"));

        // criando um currículo
        Resume resume = new Resume(person, skillsList);

        // imprimindo o book e o resume
        IPrint.print(book);
        IPrint.print(resume);
    }
}
