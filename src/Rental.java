public class Rental {
    private Vehicle vehicle;
    private int days;

    public Rental(Vehicle vehicle, int days) {
        this.vehicle = vehicle;
        this.days = days;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double calculateTotalCost() {
        return vehicle.calculateRentalCost(days);
    }

    public double calculateTotalCost(double discount) {
        return vehicle.calculateRentalCost(days);
    }
    
}
