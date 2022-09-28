package classes;

public class Vehicle {
    private String model;
    private String brand;
    private Double price;

    public Vehicle(String model, String brand, Double price) {
        this.setModel(model);
        this.setBrand(brand);
        this.setPrice(price);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ("------------------------------------------ \n" +
                this.getBrand() + " | " + this.getModel() + " | " + this.getPrice());
    }
}
