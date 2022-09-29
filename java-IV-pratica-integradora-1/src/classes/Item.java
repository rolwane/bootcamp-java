package classes;

public class Item {
    private static int instanceCounter = 0;
    private int code;
    private String name;
    private int quantityPurchased;
    private double unitPrice;

    public Item(String name, int quantityPurchased, double unitPrice) {
        this.setCode(++instanceCounter);
        this.setName(name);
        this.setQuantityPurchased(quantityPurchased);
        this.setUnitPrice(unitPrice);
    }

    public int getCode() {
        return code;
    }

    private void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
