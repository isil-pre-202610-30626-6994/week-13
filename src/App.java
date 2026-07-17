import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle car = new Car("ABC123", "Toyota", 50.0, 10.0);
        Vehicle motorcycle = new Motorcycle("XYZ789", "Honda", 30.0, 0.1);

        Rental carRental = new Rental(car, 5);
        Rental motorcycleRental = new Rental(motorcycle, 3);

        List<Rental> rentals = new ArrayList<>();
        rentals.add(carRental);
        rentals.add(motorcycleRental);

        for (Rental rental : rentals) {
            Vehicle vehicle = rental.getVehicle();
            double totalCost = rental.calculateTotalCost();
            System.out.println("Vehicle: " + vehicle.getBrand() + " (" + vehicle.getPlateNumber() + ")");
            System.out.println("Days: " + rental.getDays());
            System.out.println("Total Cost: $" + totalCost);
            System.out.println("-------------------------");
        }
    }
}
