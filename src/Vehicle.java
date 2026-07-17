public abstract class Vehicle {
    private double dailyRate;

    public Vehicle(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public abstract double calculateRentalCost(int days);
}
