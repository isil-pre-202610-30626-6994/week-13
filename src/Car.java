
public class Car extends Vehicle {

    private double dailyInsurance;

    public Car(String plateNumber, String brand, double dailyRate, double dailyInsurance) {
        super(plateNumber, brand, dailyRate);
        this.dailyInsurance = dailyInsurance;
    }

    public double getDailyInsurance() {
        return dailyInsurance;
    }

    public void setDailyInsurance(double dailyInsurance) {
        this.dailyInsurance = dailyInsurance;
    }

    @Override
    public double calculateRentalCost(int days) {
        double rentalCost = getDailyRate() * days;
        double insuranceCost = dailyInsurance * days;
        return rentalCost + insuranceCost;
    }

}
