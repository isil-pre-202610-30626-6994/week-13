
public class Motorcycle extends Vehicle {

    private double discount;

    public Motorcycle(String plateNumber, String brand, double dailyRate, double discount) {
        super(plateNumber, brand, dailyRate);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double calculateRentalCost(int days) {
        double rentalCost = getDailyRate() * days;
        return rentalCost * (1 - discount);

    }
}
