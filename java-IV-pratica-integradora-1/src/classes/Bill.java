package classes;

import java.util.List;

public class Bill {
    private Client client;
    private List<Item> itemsList;
    private double totalPrice;

    public Bill(Client client, List<Item> itemsList, double totalPrice) {
        this.setClient(client);
        this.setItemsList(itemsList);
        this.setTotalPrice(totalPrice);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
