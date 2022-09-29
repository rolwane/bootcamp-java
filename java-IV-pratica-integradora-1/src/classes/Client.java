package classes;

public class Client {
    private static int instanceCounter = 0;
    private int ID;
    private String name;
    private String lastName;

    public Client(String name, String lastName) {
        if (name.equals("") || lastName.equals("")) {
            System.out.println("Erro ao cadastrar novo cliente: As informações não podem ser vazias.");
            return;
        }

        this.setID(++instanceCounter);
        this.setName(name);
        this.setLastName(lastName);
    }

    public int getID() {
        return ID;
    }

    private void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return (
            "ID: " + this.getID() + "\n" +
            "Cliente: " + this.getName() + " " + this.getLastName()
        );
    }
}
