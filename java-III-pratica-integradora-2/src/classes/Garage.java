package classes;

import java.util.Comparator;
import java.util.List;

public class Garage {
    private static int instanceCounter = 0;
    private int id;
    private List<Vehicle> vehicleList;

    public Garage(List<Vehicle> vehicleList) {
        this.setId(instanceCounter);
        this.setVehicleList(vehicleList);

        Garage.instanceCounter += 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void getVehiclesByPriceAsc() {
        this.getVehicleList().stream()
                .sorted((a, b) -> a.getPrice().intValue() - b.getPrice().intValue())
                .forEach(System.out::println);
    }

    public void getVehiclesByPriceDesc() {
        this.getVehicleList().stream()
                .sorted((a, b) -> b.getPrice().intValue() - a.getPrice().intValue())
                .forEach(System.out::println);
    }

    public void getVehiclesByBrand() {
        this.getVehicleList().stream()
                .sorted((a, b) -> a.getBrand().compareTo(b.getBrand()))
                .forEach(System.out::println);
    }

    public void getVehiclesByPriceLessThan(Double filterPrice) {
        this.getVehicleList().stream()
                .filter((Vehicle) -> Vehicle.getPrice() < filterPrice)
                .forEach(System.out::println);
    }
}
