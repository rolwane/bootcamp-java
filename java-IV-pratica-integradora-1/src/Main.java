import classes.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Client> clientList = new HashMap<>();

        // criando clientes
        Client client1 = new Client("Antonia", "Ingrid");
        Client client2 = new Client("Francisco", "Santos");
        Client client3 = new Client("Maria", "Iane");

        // salvando clientes na coleção
        clientList.put(client1.getID(), client1);
        clientList.put(client2.getID(), client2);
        clientList.put(client3.getID(), client3);

        // mostrando os clientes na tela
        clientList.forEach((id, client) -> System.out.println(client + "\n"));

        System.out.println("--------------------------- \n");

        // removendo um cliente da coleção
        clientList.remove(client3.getID());

        // mostrando os clientes na tela
        clientList.forEach((id, client) -> System.out.println(client + "\n"));

        // scanner para ler informação do teclado
        Scanner keyboard = new Scanner(System.in);

        // lendo id do usuário
        System.out.println("Digite um ID para buscar um cliente");
        long id = keyboard.nextLong();

        Client foundClient = clientList.get((int) id);

        if (foundClient == null) {
            System.out.println("Usuário com o ID informado não foi encontrado.");
            return;
        }

        System.out.println(foundClient);
    }
}
