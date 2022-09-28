import classes.Garage;
import classes.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // criando a lista de veículos
        List<Vehicle> vehicleList = new ArrayList<>();

        // populando a lista com veículos
        vehicleList.add(new Vehicle("Fiesta", "Ford", 1000.00));
        vehicleList.add(new Vehicle("Focus", "Ford", 1200.00));
        vehicleList.add(new Vehicle("Explorer", "Ford", 2500.00));
        vehicleList.add(new Vehicle("Uno", "Fiat", 500.00));
        vehicleList.add(new Vehicle("Cronos", "Fiat", 1000.00));
        vehicleList.add(new Vehicle("Torino", "Fiat", 1250.00));
        vehicleList.add(new Vehicle("Aveo", "Chevrolet", 1250.00));
        vehicleList.add(new Vehicle("Spin", "Chevrolet", 2500.00));
        vehicleList.add(new Vehicle("Toyota", "Corola", 1200.00));
        vehicleList.add(new Vehicle("Toyota", "Fortuner", 3000.00));
        vehicleList.add(new Vehicle("Logan", "Renault", 950.00));

        // criando uma garagem
        Garage garage = new Garage(vehicleList);

        // imprimindo veículos ordenados por preço do menor para o maior
        System.out.println("Veículos ordenados por preço do menor para o maior:");
        garage.getVehiclesByPriceAsc();

        // imprimindo veículos ordenados por marca
        System.out.println("\n \nVeículos ordenados por marca:");
        garage.getVehiclesByBrand();

        // imprimindo os veículos que tem o preço menor que 1000
        System.out.println("\n \nVeículos com preço menor que 1000");
        garage.getVehiclesByPriceLessThan(1000.0);
    }
}
