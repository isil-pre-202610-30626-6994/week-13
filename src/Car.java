
public class Car extends Vehicle {

    private double dailyInsurance;

    public Car(double dailyRate, double dailyInsurance) {
        super(dailyRate);
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
